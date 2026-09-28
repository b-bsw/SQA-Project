package org.apache.commons.lang3.reflect;

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
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(type0, type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.reflect.Type type1 = null;
        boolean boolean2 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) 10.0d, type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(type0);
        org.junit.Assert.assertNull(type1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.reflect.ParameterizedType parameterizedType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> wildcardTypeVariableMap1 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(parameterizedType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.reflect.WildcardType wildcardType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(wildcardType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.reflect.Type type0 = null;
        boolean boolean1 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(type0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = null;
        java.lang.reflect.Type type1 = null;
        boolean boolean2 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(obj0, type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.reflect.WildcardType wildcardType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(wildcardType0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.reflect.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[] typeArray1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils3 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass4 = typeUtils3.getClass();
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (byte) 1, (java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type8 = null;
        boolean boolean9 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, type8);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        boolean boolean3 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) 0.0d, (java.lang.reflect.Type) wildcardClass2);
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.reflect.Type type0 = null;
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils3 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass4 = typeUtils3.getClass();
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils7 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass8 = typeUtils7.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils9 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass10 = typeUtils9.getClass();
        boolean boolean11 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass8, (java.lang.reflect.Type) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(type0, (java.lang.reflect.Type) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown type: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        java.lang.reflect.Type type12 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils3 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass4 = typeUtils3.getClass();
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils7 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass8 = typeUtils7.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils9 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass10 = typeUtils9.getClass();
        boolean boolean11 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass8, (java.lang.reflect.Type) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass8);
        boolean boolean13 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type14 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean15 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (short) 1, type14);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils12 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass13 = typeUtils12.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils14 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass15 = typeUtils14.getClass();
        boolean boolean16 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass13, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean17 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass13);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils18 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass19 = typeUtils18.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils20 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass21 = typeUtils20.getClass();
        boolean boolean22 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass13, (java.lang.reflect.Type) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass11, (java.lang.reflect.Type) wildcardClass13);
        boolean boolean25 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass13);
        boolean boolean26 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass13);
        java.lang.reflect.Type type15 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass7);
        java.lang.reflect.Type type16 = null;
        java.lang.Class<?> wildcardClass17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass7, type16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils12 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass13 = typeUtils12.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils14 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass15 = typeUtils14.getClass();
        boolean boolean16 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass13, (java.lang.reflect.Type) wildcardClass15);
        boolean boolean17 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass13);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils18 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass19 = typeUtils18.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils20 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass21 = typeUtils20.getClass();
        boolean boolean22 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass19, (java.lang.reflect.Type) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass13, (java.lang.reflect.Type) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass11, (java.lang.reflect.Type) wildcardClass13);
        java.lang.reflect.Type type25 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNull(type25);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(type5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.reflect.Type type1 = null;
        boolean boolean2 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) "", type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        boolean boolean2 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean3 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type7 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNull(type7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.reflect.Type type1 = null;
        boolean boolean2 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (-1.0d), type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        java.lang.reflect.Type type2 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(type2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.reflect.Type type0 = null;
        java.lang.reflect.Type type1 = null;
        boolean boolean2 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type0, type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass13);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils15 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass16 = typeUtils15.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils17 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass18 = typeUtils17.getClass();
        boolean boolean19 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass16, (java.lang.reflect.Type) wildcardClass18);
        java.lang.reflect.Type type20 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass16);
        boolean boolean21 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass16);
        java.lang.reflect.Type type22 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass16);
        java.lang.reflect.Type type23 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(type22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(type22);
        org.junit.Assert.assertNull(type23);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        java.lang.reflect.Type type12 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass11);
        java.lang.reflect.Type type13 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(type13);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.reflect.Type type0 = null;
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils3 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass4 = typeUtils3.getClass();
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils7 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass8 = typeUtils7.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils9 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass10 = typeUtils9.getClass();
        boolean boolean11 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass8, (java.lang.reflect.Type) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass8);
        boolean boolean13 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type14 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean15 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(type0, (java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Object obj0 = null;
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils3 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass4 = typeUtils3.getClass();
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils7 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass8 = typeUtils7.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils9 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass10 = typeUtils9.getClass();
        boolean boolean11 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass8, (java.lang.reflect.Type) wildcardClass10);
        boolean boolean12 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass8);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils13 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass14 = typeUtils13.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils15 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass16 = typeUtils15.getClass();
        boolean boolean17 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass14, (java.lang.reflect.Type) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass8, (java.lang.reflect.Type) wildcardClass14);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils19 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass20 = typeUtils19.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils21 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass22 = typeUtils21.getClass();
        boolean boolean23 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass20, (java.lang.reflect.Type) wildcardClass22);
        boolean boolean24 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass20);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils25 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass26 = typeUtils25.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils27 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass28 = typeUtils27.getClass();
        boolean boolean29 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass26, (java.lang.reflect.Type) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass20, (java.lang.reflect.Type) wildcardClass26);
        java.lang.Class<?> wildcardClass31 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass18, (java.lang.reflect.Type) wildcardClass20);
        boolean boolean32 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass31);
        boolean boolean33 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(obj0, (java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        java.lang.reflect.Type type12 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.Type type13 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.Type type14 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(type14);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils3 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass4 = typeUtils3.getClass();
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (byte) 1, (java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type8 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(type8);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils3 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass4 = typeUtils3.getClass();
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass4);
        boolean boolean6 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass2);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) (byte) 1, (java.lang.reflect.Type) wildcardClass2);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass9);
        boolean boolean11 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass9);
        boolean boolean12 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass2, (java.lang.reflect.Type) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        boolean boolean2 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.Type type3 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(type3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass3);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(type6);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(type5);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        java.lang.reflect.Type type6 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass1);
        boolean boolean7 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        boolean boolean12 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass11);
        boolean boolean13 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass13);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils15 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass16 = typeUtils15.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils17 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass18 = typeUtils17.getClass();
        boolean boolean19 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass16, (java.lang.reflect.Type) wildcardClass18);
        java.lang.reflect.Type type20 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass16);
        boolean boolean21 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass16);
        java.lang.reflect.Type type22 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass7);
        boolean boolean23 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils1 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass2 = typeUtils1.getClass();
        boolean boolean3 = org.apache.commons.lang3.reflect.TypeUtils.isInstance((java.lang.Object) 0.0d, (java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type4 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Type type5 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(type4);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(type5);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.lang3.reflect.TypeUtils typeUtils0 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass1 = typeUtils0.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils2 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass3 = typeUtils2.getClass();
        boolean boolean4 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass3);
        boolean boolean5 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass1);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils6 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass7 = typeUtils6.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils8 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass9 = typeUtils8.getClass();
        boolean boolean10 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType((java.lang.reflect.Type) wildcardClass1, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass13);
        org.apache.commons.lang3.reflect.TypeUtils typeUtils15 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass16 = typeUtils15.getClass();
        org.apache.commons.lang3.reflect.TypeUtils typeUtils17 = new org.apache.commons.lang3.reflect.TypeUtils();
        java.lang.Class<?> wildcardClass18 = typeUtils17.getClass();
        boolean boolean19 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass16, (java.lang.reflect.Type) wildcardClass18);
        java.lang.reflect.Type type20 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType((java.lang.reflect.Type) wildcardClass16);
        boolean boolean21 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable((java.lang.reflect.Type) wildcardClass7, (java.lang.reflect.Type) wildcardClass16);
        boolean boolean22 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType((java.lang.reflect.Type) wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(type20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}

