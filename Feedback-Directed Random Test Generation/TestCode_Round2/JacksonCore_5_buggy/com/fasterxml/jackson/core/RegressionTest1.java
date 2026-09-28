package com.fasterxml.jackson.core;

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        int int17 = jsonPointer14._matchingElementIndex;
        java.lang.String str18 = jsonPointer14.getMatchingProperty();
        int int19 = jsonPointer14._matchingElementIndex;
        java.lang.String str20 = jsonPointer14.toString();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer18.matchElement((int) ' ');
        java.lang.String str23 = jsonPointer18._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer18);
        int int25 = jsonPointer24.getMatchingIndex();
        boolean boolean26 = jsonPointer14.equals((java.lang.Object) jsonPointer24);
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer14.matchProperty("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jsonPointer28);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean10 = jsonPointer9.matches();
        java.lang.String str11 = jsonPointer9._asString;
        java.lang.String str12 = jsonPointer9._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9._nextSegment;
        java.lang.String str15 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer9.tail();
        java.lang.String str17 = jsonPointer16.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        boolean boolean6 = jsonPointer1.matches();
        int int7 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        boolean boolean15 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str18 = jsonPointer17._matchingPropertyName;
        boolean boolean19 = jsonPointer17.mayMatchElement();
        boolean boolean20 = jsonPointer17.mayMatchProperty();
        int int21 = jsonPointer17._matchingElementIndex;
        boolean boolean22 = jsonPointer10.equals((java.lang.Object) jsonPointer17);
        int int23 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer17.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = jsonPointer25._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        java.lang.String str10 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonPointer13.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = jsonPointer0.mayMatchElement();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        boolean boolean10 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonPointer10._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = jsonPointer2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        java.lang.String str6 = jsonPointer4._asString;
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        boolean boolean9 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10.matchProperty("hi!");
        int int14 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer10.tail();
        boolean boolean16 = jsonPointer8.equals((java.lang.Object) jsonPointer10);
        boolean boolean17 = jsonPointer10.mayMatchElement();
        boolean boolean18 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        java.lang.String str20 = jsonPointer19.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer18.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer18.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer18._nextSegment;
        boolean boolean25 = jsonPointer16.equals((java.lang.Object) jsonPointer24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = jsonPointer24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement(0);
        java.lang.String str8 = jsonPointer5._matchingPropertyName;
        boolean boolean9 = jsonPointer5.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        boolean boolean16 = jsonPointer11.mayMatchElement();
        int int17 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        java.lang.String str19 = jsonPointer18.toString();
        java.lang.Class<?> wildcardClass20 = jsonPointer18.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer4.matchElement((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonPointer13._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str7 = jsonPointer5._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        boolean boolean9 = jsonPointer1.matches();
        java.lang.String str10 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        boolean boolean16 = jsonPointer11.mayMatchElement();
        int int17 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        java.lang.Class<?> wildcardClass19 = jsonPointer11.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean7 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.matchProperty("hi!");
        int int12 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.tail();
        boolean boolean14 = jsonPointer6.equals((java.lang.Object) jsonPointer8);
        boolean boolean15 = jsonPointer8.mayMatchElement();
        boolean boolean16 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer8.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = jsonPointer17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int16 = jsonPointer15.getMatchingIndex();
        java.lang.String str17 = jsonPointer15._matchingPropertyName;
        java.lang.String str18 = jsonPointer15._matchingPropertyName;
        boolean boolean19 = jsonPointer11.equals((java.lang.Object) jsonPointer15);
        boolean boolean20 = jsonPointer15.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer15.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = jsonPointer23._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        java.lang.String str4 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean3 = jsonPointer0.equals((java.lang.Object) (short) 1);
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchElement((int) ' ');
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        boolean boolean25 = jsonPointer21.mayMatchElement();
        int int26 = jsonPointer21.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer21);
        boolean boolean28 = jsonPointer27.mayMatchProperty();
        boolean boolean29 = jsonPointer27.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer27);
        boolean boolean31 = jsonPointer10.equals((java.lang.Object) jsonPointer27);
        boolean boolean32 = jsonPointer0.equals((java.lang.Object) boolean31);
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jsonPointer34);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (short) 1);
        boolean boolean16 = jsonPointer13.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer24);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer24);
        int int27 = jsonPointer26._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer26._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer26);
        boolean boolean30 = jsonPointer29.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer34.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer34.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer34);
        boolean boolean40 = jsonPointer29.equals((java.lang.Object) jsonPointer39);
        boolean boolean41 = jsonPointer13.equals((java.lang.Object) jsonPointer39);
        int int42 = jsonPointer39._matchingElementIndex;
        boolean boolean43 = jsonPointer11.equals((java.lang.Object) int42);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertNull(jsonPointer36);
        org.junit.Assert.assertNull(jsonPointer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        java.lang.String str14 = jsonPointer11._asString;
        java.lang.String str15 = jsonPointer11._asString;
        java.lang.String str16 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean20 = jsonPointer19.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        int int25 = jsonPointer21.getMatchingIndex();
        boolean boolean26 = jsonPointer19.equals((java.lang.Object) jsonPointer21);
        java.lang.String str27 = jsonPointer19.getMatchingProperty();
        int int28 = jsonPointer19.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer19.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer19.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        boolean boolean34 = jsonPointer11.equals((java.lang.Object) "hi!");
        java.lang.String str35 = jsonPointer11.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer4._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        java.lang.String str11 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.Class<?> wildcardClass13 = jsonPointer12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer10.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        boolean boolean15 = jsonPointer14.mayMatchProperty();
        java.lang.String str16 = jsonPointer14._asString;
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        java.lang.String str6 = jsonPointer3._asString;
        boolean boolean7 = jsonPointer3.matches();
        boolean boolean8 = jsonPointer3.matches();
        java.lang.String str9 = jsonPointer3._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        boolean boolean13 = jsonPointer9.equals((java.lang.Object) 1.0d);
        java.lang.String str14 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchProperty("hi!");
        boolean boolean18 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        boolean boolean20 = jsonPointer15.matches();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        boolean boolean14 = jsonPointer11.equals((java.lang.Object) 0.0d);
        boolean boolean15 = jsonPointer11.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean18 = jsonPointer14.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass19 = jsonPointer14.getClass();
        boolean boolean20 = jsonPointer1.equals((java.lang.Object) wildcardClass19);
        java.lang.String str21 = jsonPointer1._asString;
        int int22 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        boolean boolean13 = jsonPointer12.mayMatchProperty();
        boolean boolean14 = jsonPointer12.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer15);
        int int17 = jsonPointer16.getMatchingIndex();
        boolean boolean18 = jsonPointer16.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        boolean boolean6 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (byte) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchElement((int) ' ');
        java.lang.String str18 = jsonPointer13._matchingPropertyName;
        java.lang.String str19 = jsonPointer13.getMatchingProperty();
        int int20 = jsonPointer13._matchingElementIndex;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jsonPointer11.equals((java.lang.Object) jsonPointer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21.matchElement((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = jsonPointer24.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer24);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        boolean boolean18 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer22.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer22);
        boolean boolean28 = jsonPointer17.equals((java.lang.Object) jsonPointer27);
        boolean boolean29 = jsonPointer1.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer27.matchElement((int) (byte) 0);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertNull(jsonPointer32);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = jsonPointer3.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchElement((int) (short) 0);
        int int7 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonPointer8.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchElement((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3.matchElement((int) '4');
        java.lang.String str7 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchElement((int) (short) 0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean11 = jsonPointer10.mayMatchElement();
        java.lang.String str12 = jsonPointer10._asString;
        java.lang.String str13 = jsonPointer10._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10._nextSegment;
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        boolean boolean16 = jsonPointer3.equals((java.lang.Object) str15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0._nextSegment;
        boolean boolean6 = jsonPointer0.matches();
        java.lang.String str7 = jsonPointer0._asString;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        java.lang.String str2 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (byte) 1);
        java.lang.String str3 = jsonPointer2.toString();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14.matchElement((int) ' ');
        java.lang.String str19 = jsonPointer14._matchingPropertyName;
        java.lang.String str20 = jsonPointer14.toString();
        boolean boolean21 = jsonPointer10.equals((java.lang.Object) jsonPointer14);
        java.lang.String str22 = jsonPointer14.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean3 = jsonPointer0.equals((java.lang.Object) (short) 1);
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0._asString;
        boolean boolean6 = jsonPointer0.mayMatchElement();
        java.lang.String str7 = jsonPointer0._asString;
        java.lang.String str8 = jsonPointer0.toString();
        java.lang.String str9 = jsonPointer0.getMatchingProperty();
        java.lang.String str10 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        java.lang.String str7 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str17 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int19 = jsonPointer18.getMatchingIndex();
        boolean boolean20 = jsonPointer2.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean24 = jsonPointer23.mayMatchElement();
        java.lang.String str25 = jsonPointer23._asString;
        boolean boolean26 = jsonPointer23.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer23);
        java.lang.String str28 = jsonPointer27._asString;
        boolean boolean29 = jsonPointer27.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27._nextSegment;
        boolean boolean31 = jsonPointer2.equals((java.lang.Object) jsonPointer27);
        boolean boolean32 = jsonPointer27.matches();
        boolean boolean33 = jsonPointer27.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        java.lang.String str14 = jsonPointer11._asString;
        int int15 = jsonPointer11.getMatchingIndex();
        java.lang.Class<?> wildcardClass16 = jsonPointer11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 1);
        boolean boolean3 = jsonPointer2.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.tail();
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        boolean boolean14 = jsonPointer10.mayMatchElement();
        int int15 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10._nextSegment;
        boolean boolean18 = jsonPointer4.equals((java.lang.Object) jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        int int20 = jsonPointer19._matchingElementIndex;
        int int21 = jsonPointer19.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer19);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean18 = jsonPointer14.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass19 = jsonPointer14.getClass();
        boolean boolean20 = jsonPointer1.equals((java.lang.Object) wildcardClass19);
        int int21 = jsonPointer1._matchingElementIndex;
        java.lang.Class<?> wildcardClass22 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2._asString;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str17 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int19 = jsonPointer18.getMatchingIndex();
        boolean boolean20 = jsonPointer2.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean24 = jsonPointer23.mayMatchElement();
        java.lang.String str25 = jsonPointer23._asString;
        boolean boolean26 = jsonPointer23.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer23);
        java.lang.String str28 = jsonPointer27._asString;
        boolean boolean29 = jsonPointer27.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27._nextSegment;
        boolean boolean31 = jsonPointer2.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer27._nextSegment;
        boolean boolean33 = jsonPointer27.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        int int13 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        boolean boolean15 = jsonPointer11.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonPointer16.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        int int12 = jsonPointer11.getMatchingIndex();
        boolean boolean13 = jsonPointer11.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonPointer14.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        boolean boolean18 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer22.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer22);
        boolean boolean28 = jsonPointer17.equals((java.lang.Object) jsonPointer27);
        boolean boolean29 = jsonPointer1.equals((java.lang.Object) jsonPointer27);
        int int30 = jsonPointer27._matchingElementIndex;
        int int31 = jsonPointer27._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0.matchProperty("");
        boolean boolean5 = jsonPointer0.matches();
        int int6 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.tail();
        int int15 = jsonPointer9.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = jsonPointer5._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer9._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        java.lang.String str9 = jsonPointer3.toString();
        java.lang.String str10 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer3.matchElement((int) '#');
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("hi!");
        java.lang.Class<?> wildcardClass17 = jsonPointer16.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchElement((int) '#');
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = jsonPointer18.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        java.lang.String str23 = jsonPointer21._asString;
        java.lang.String str24 = jsonPointer21.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer21.tail();
        java.lang.String str26 = jsonPointer21.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer21._nextSegment;
        java.lang.String str28 = jsonPointer21._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.Class<?> wildcardClass18 = jsonPointer11.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean7 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.matchProperty("hi!");
        int int12 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.tail();
        boolean boolean14 = jsonPointer6.equals((java.lang.Object) jsonPointer8);
        boolean boolean15 = jsonPointer8.mayMatchElement();
        java.lang.Class<?> wildcardClass16 = jsonPointer8.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        int int17 = jsonPointer14._matchingElementIndex;
        boolean boolean18 = jsonPointer14.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str13 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        int int22 = jsonPointer18.getMatchingIndex();
        boolean boolean23 = jsonPointer16.equals((java.lang.Object) jsonPointer18);
        boolean boolean24 = jsonPointer16.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer28);
        boolean boolean30 = jsonPointer16.equals((java.lang.Object) jsonPointer29);
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer29.tail();
        java.lang.String str32 = jsonPointer29.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer29);
        java.lang.String str34 = jsonPointer33.getMatchingProperty();
        boolean boolean35 = jsonPointer2.equals((java.lang.Object) str34);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonPointer31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jsonPointer5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonPointer9._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean3 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean5 = jsonPointer4.mayMatchProperty();
        int int6 = jsonPointer4.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str9 = jsonPointer2.toString();
        boolean boolean10 = jsonPointer2.matches();
        java.lang.String str11 = jsonPointer2._asString;
        boolean boolean12 = jsonPointer2.matches();
        java.lang.String str13 = jsonPointer2._asString;
        java.lang.String str14 = jsonPointer2.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2.matchProperty("hi!");
        java.lang.String str15 = jsonPointer2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.tail();
        java.lang.String str13 = jsonPointer12.toString();
        java.lang.String str14 = jsonPointer12._matchingPropertyName;
        java.lang.String str15 = jsonPointer12._matchingPropertyName;
        int int16 = jsonPointer12.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer12);
        java.lang.String str18 = jsonPointer12._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        java.lang.String str3 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) 1);
        boolean boolean9 = jsonPointer6.matches();
        java.lang.String str10 = jsonPointer6.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer6.matchProperty("hi!");
        java.lang.String str13 = jsonPointer6._matchingPropertyName;
        boolean boolean14 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean18 = jsonPointer17.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        int int20 = jsonPointer19._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.tail();
        boolean boolean22 = jsonPointer19.mayMatchProperty();
        int int23 = jsonPointer19.getMatchingIndex();
        boolean boolean24 = jsonPointer17.equals((java.lang.Object) jsonPointer19);
        java.lang.String str25 = jsonPointer17._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer17);
        boolean boolean27 = jsonPointer6.equals((java.lang.Object) jsonPointer26);
        boolean boolean28 = jsonPointer6.mayMatchElement();
        boolean boolean29 = jsonPointer1.equals((java.lang.Object) boolean28);
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer35);
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer35);
        boolean boolean38 = jsonPointer37.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = jsonPointer37._nextSegment;
        boolean boolean40 = jsonPointer1.equals((java.lang.Object) jsonPointer39);
        int int41 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonPointer35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonPointer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        java.lang.String str10 = jsonPointer1._matchingPropertyName;
        int int11 = jsonPointer1._matchingElementIndex;
        java.lang.Class<?> wildcardClass12 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        boolean boolean23 = jsonPointer1.mayMatchElement();
        int int24 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement((int) (byte) 10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer();
        int int14 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer13.matchProperty("hi!");
        int int17 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13.matchProperty("hi!");
        boolean boolean20 = jsonPointer13.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer13._nextSegment;
        java.lang.String str22 = jsonPointer13._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        boolean boolean24 = jsonPointer2.equals((java.lang.Object) jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean8 = jsonPointer7.matches();
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) boolean8);
        int int10 = jsonPointer0.getMatchingIndex();
        java.lang.String str11 = jsonPointer0.toString();
        boolean boolean12 = jsonPointer0.mayMatchProperty();
        boolean boolean13 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        boolean boolean15 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str18 = jsonPointer17._matchingPropertyName;
        boolean boolean19 = jsonPointer17.mayMatchElement();
        boolean boolean20 = jsonPointer17.mayMatchProperty();
        int int21 = jsonPointer17._matchingElementIndex;
        boolean boolean22 = jsonPointer10.equals((java.lang.Object) jsonPointer17);
        int int23 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer17.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = jsonPointer25.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        int int8 = jsonPointer1.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        int int4 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        int int8 = jsonPointer2._matchingElementIndex;
        int int9 = jsonPointer2._matchingElementIndex;
        java.lang.String str10 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        java.lang.String str14 = jsonPointer2._asString;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int1 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) "hi!");
        java.lang.String str10 = jsonPointer0._matchingPropertyName;
        int int11 = jsonPointer0.getMatchingIndex();
        boolean boolean12 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        java.lang.String str11 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str13 = jsonPointer2._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer6.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2._nextSegment;
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        java.lang.String str9 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.Class<?> wildcardClass11 = jsonPointer2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.matchElement((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = jsonPointer10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchElement((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21.matchElement((int) 'a');
        boolean boolean25 = jsonPointer21.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer21.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jsonPointer27);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.tail();
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        boolean boolean14 = jsonPointer10.mayMatchElement();
        int int15 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10._nextSegment;
        boolean boolean18 = jsonPointer4.equals((java.lang.Object) jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        boolean boolean20 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        boolean boolean22 = jsonPointer21.matches();
        boolean boolean23 = jsonPointer21.mayMatchProperty();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        boolean boolean12 = jsonPointer8.mayMatchElement();
        int int13 = jsonPointer8.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer8);
        boolean boolean15 = jsonPointer14.mayMatchProperty();
        boolean boolean16 = jsonPointer14.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14.tail();
        java.lang.String str19 = jsonPointer18._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer18);
        boolean boolean24 = jsonPointer18.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        boolean boolean16 = jsonPointer15.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        java.lang.String str14 = jsonPointer13.toString();
        boolean boolean16 = jsonPointer13.equals((java.lang.Object) 0.0d);
        boolean boolean17 = jsonPointer13.mayMatchElement();
        java.lang.String str18 = jsonPointer13._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer13._nextSegment;
        boolean boolean21 = jsonPointer13.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        java.lang.String str15 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchElement((int) (byte) 100);
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchElement((int) (short) 0);
        java.lang.String str7 = jsonPointer1._matchingPropertyName;
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.Class<?> wildcardClass9 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        boolean boolean9 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        java.lang.String str11 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str13 = jsonPointer12._asString;
        java.lang.String str14 = jsonPointer12.toString();
        java.lang.String str15 = jsonPointer12._asString;
        java.lang.Class<?> wildcardClass16 = jsonPointer12.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        boolean boolean13 = jsonPointer9.equals((java.lang.Object) 1.0d);
        java.lang.String str14 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchProperty("hi!");
        boolean boolean18 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        boolean boolean20 = jsonPointer19.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchProperty("hi!");
        java.lang.String str9 = jsonPointer3._asString;
        java.lang.String str10 = jsonPointer3._asString;
        java.lang.String str11 = jsonPointer3.toString();
        boolean boolean12 = jsonPointer3.mayMatchProperty();
        int int13 = jsonPointer3._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        java.lang.Class<?> wildcardClass5 = jsonPointer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        int int9 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7._nextSegment;
        int int11 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7.matchElement(100);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jsonPointer12._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        int int10 = jsonPointer9.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        int int18 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17._nextSegment;
        boolean boolean20 = jsonPointer3.equals((java.lang.Object) jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.Class<?> wildcardClass4 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3._nextSegment;
        boolean boolean5 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonPointer6.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str17 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int19 = jsonPointer18.getMatchingIndex();
        boolean boolean20 = jsonPointer2.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean24 = jsonPointer23.mayMatchElement();
        java.lang.String str25 = jsonPointer23._asString;
        boolean boolean26 = jsonPointer23.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer23);
        java.lang.String str28 = jsonPointer27._asString;
        boolean boolean29 = jsonPointer27.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27._nextSegment;
        boolean boolean31 = jsonPointer2.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer2.matchElement((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jsonPointer33);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        int int6 = jsonPointer0._matchingElementIndex;
        int int7 = jsonPointer0._matchingElementIndex;
        java.lang.String str8 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9._nextSegment;
        boolean boolean15 = jsonPointer14.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchProperty("hi!");
        java.lang.Class<?> wildcardClass18 = jsonPointer14.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        boolean boolean3 = jsonPointer1.matches();
        boolean boolean4 = jsonPointer1.matches();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        int int4 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        int int8 = jsonPointer2._matchingElementIndex;
        int int9 = jsonPointer2._matchingElementIndex;
        java.lang.String str10 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        int int5 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        java.lang.String str4 = jsonPointer2.getMatchingProperty();
        boolean boolean5 = jsonPointer2.mayMatchElement();
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str8 = jsonPointer7._asString;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) 1);
        boolean boolean9 = jsonPointer6.matches();
        java.lang.String str10 = jsonPointer6.getMatchingProperty();
        boolean boolean11 = jsonPointer6.mayMatchElement();
        boolean boolean12 = jsonPointer3.equals((java.lang.Object) jsonPointer6);
        boolean boolean13 = jsonPointer6.matches();
        boolean boolean14 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer6.tail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        int int6 = jsonPointer3.getMatchingIndex();
        java.lang.String str7 = jsonPointer3._asString;
        boolean boolean8 = jsonPointer3.matches();
        int int9 = jsonPointer3._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer3.matchElement((int) 'a');
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchProperty("hi!");
        java.lang.Class<?> wildcardClass15 = jsonPointer11.getClass();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        boolean boolean14 = jsonPointer11.equals((java.lang.Object) 0.0d);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.getMatchingProperty();
        int int8 = jsonPointer1._matchingElementIndex;
        java.lang.String str9 = jsonPointer1.toString();
        java.lang.Class<?> wildcardClass10 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        boolean boolean2 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonPointer4.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        java.lang.String str11 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2._nextSegment;
        java.lang.String str13 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer2.matchProperty("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean13 = jsonPointer7.equals((java.lang.Object) jsonPointer12);
        boolean boolean14 = jsonPointer12.mayMatchProperty();
        java.lang.String str15 = jsonPointer12._asString;
        java.lang.Class<?> wildcardClass16 = jsonPointer12.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        int int6 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.matchProperty("hi!");
        int int13 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        boolean boolean16 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer9._nextSegment;
        java.lang.String str18 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer9);
        boolean boolean20 = jsonPointer1.equals((java.lang.Object) jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19._nextSegment;
        boolean boolean22 = jsonPointer19.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement((int) (byte) 10);
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        int int17 = jsonPointer14._matchingElementIndex;
        int int18 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.matchProperty("");
        boolean boolean22 = jsonPointer21.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str25 = jsonPointer24._matchingPropertyName;
        boolean boolean26 = jsonPointer24.mayMatchElement();
        boolean boolean27 = jsonPointer24.mayMatchProperty();
        int int28 = jsonPointer24._matchingElementIndex;
        java.lang.String str29 = jsonPointer24._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer24.tail();
        boolean boolean31 = jsonPointer21.equals((java.lang.Object) jsonPointer30);
        boolean boolean32 = jsonPointer2.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        boolean boolean13 = jsonPointer12.mayMatchProperty();
        boolean boolean14 = jsonPointer12.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer12.tail();
        java.lang.String str17 = jsonPointer16._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer18);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        boolean boolean6 = jsonPointer1.matches();
        int int7 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((int) 'a');
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        java.lang.String str17 = jsonPointer16.getMatchingProperty();
        int int18 = jsonPointer16.getMatchingIndex();
        java.lang.Class<?> wildcardClass19 = jsonPointer16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = jsonPointer9.equals((java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        int int6 = jsonPointer0.getMatchingIndex();
        java.lang.String str7 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((int) (byte) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        java.lang.String str10 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer11.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0.toString();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        int int8 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        int int13 = jsonPointer12._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12.tail();
        boolean boolean15 = jsonPointer12.mayMatchProperty();
        int int16 = jsonPointer12.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer12.tail();
        java.lang.String str18 = jsonPointer12.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        java.lang.String str20 = jsonPointer19._matchingPropertyName;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jsonPointer9.equals((java.lang.Object) jsonPointer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        int int12 = jsonPointer11.getMatchingIndex();
        boolean boolean13 = jsonPointer11.mayMatchProperty();
        boolean boolean14 = jsonPointer11.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer15.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.matches();
        java.lang.String str5 = jsonPointer0.toString();
        java.lang.String str6 = jsonPointer0.toString();
        java.lang.String str7 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        java.lang.String str18 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        int int20 = jsonPointer15.getMatchingIndex();
        int int21 = jsonPointer15._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer15.tail();
        int int23 = jsonPointer15.getMatchingIndex();
        boolean boolean24 = jsonPointer15.matches();
        java.lang.String str25 = jsonPointer15._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonPointer15.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0._matchingElementIndex;
        int int5 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        int int6 = jsonPointer5._matchingElementIndex;
        java.lang.String str7 = jsonPointer5.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str9 = jsonPointer8.toString();
        boolean boolean10 = jsonPointer8.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        java.lang.String str8 = jsonPointer0.toString();
        java.lang.String str9 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        java.lang.String str17 = jsonPointer16.getMatchingProperty();
        int int18 = jsonPointer16.getMatchingIndex();
        java.lang.Class<?> wildcardClass19 = jsonPointer16.getClass();
        boolean boolean20 = jsonPointer0.equals((java.lang.Object) jsonPointer16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonPointer7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        boolean boolean3 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        java.lang.String str7 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        java.lang.String str9 = jsonPointer0._matchingPropertyName;
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        java.lang.String str3 = jsonPointer0._asString;
        java.lang.String str4 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        boolean boolean10 = jsonPointer7.matches();
        java.lang.String str11 = jsonPointer7._asString;
        boolean boolean12 = jsonPointer7.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7.tail();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        boolean boolean6 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 1);
        boolean boolean11 = jsonPointer8.matches();
        java.lang.String str12 = jsonPointer8.getMatchingProperty();
        boolean boolean13 = jsonPointer8.mayMatchElement();
        boolean boolean14 = jsonPointer5.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer15._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.matchElement(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = jsonPointer18.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        boolean boolean14 = jsonPointer13.mayMatchElement();
        java.lang.String str15 = jsonPointer13._asString;
        java.lang.String str16 = jsonPointer13._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        java.lang.String str10 = jsonPointer3._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3.tail();
        java.lang.String str5 = jsonPointer3._asString;
        java.lang.Class<?> wildcardClass6 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str7 = jsonPointer6._asString;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        boolean boolean15 = jsonPointer10.mayMatchElement();
        java.lang.String str16 = jsonPointer10.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10._nextSegment;
        java.lang.String str18 = jsonPointer10.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer10.matchElement(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        java.lang.String str10 = jsonPointer1.toString();
        java.lang.Class<?> wildcardClass11 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer6.matchProperty("hi!");
        int int10 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer6.matchProperty("hi!");
        boolean boolean13 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer6._nextSegment;
        java.lang.String str15 = jsonPointer6._matchingPropertyName;
        java.lang.String str16 = jsonPointer6._asString;
        boolean boolean17 = jsonPointer6.matches();
        boolean boolean18 = jsonPointer6.matches();
        boolean boolean19 = jsonPointer3.equals((java.lang.Object) boolean18);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11.tail();
        java.lang.String str13 = jsonPointer11._asString;
        int int14 = jsonPointer11._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2.matchProperty("");
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer16);
        boolean boolean19 = jsonPointer18.mayMatchElement();
        java.lang.String str20 = jsonPointer18.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.tail();
        boolean boolean22 = jsonPointer2.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer2._nextSegment;
        boolean boolean25 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(jsonPointer26);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        java.lang.String str4 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        java.lang.String str9 = jsonPointer3.toString();
        boolean boolean10 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer3.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jsonPointer12._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        java.lang.String str9 = jsonPointer3.toString();
        boolean boolean10 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str12 = jsonPointer11._matchingPropertyName;
        int int13 = jsonPointer11._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str17 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int19 = jsonPointer18.getMatchingIndex();
        boolean boolean20 = jsonPointer2.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(jsonPointer2);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        boolean boolean3 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str8 = jsonPointer7._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7.matchElement(100);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        int int13 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer();
        int int18 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer17.matchProperty("hi!");
        int int21 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer17.matchProperty("hi!");
        boolean boolean24 = jsonPointer17.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer17._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer17.tail();
        java.lang.String str27 = jsonPointer17.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer17);
        boolean boolean29 = jsonPointer14.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        int int6 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        int int15 = jsonPointer11.getMatchingIndex();
        boolean boolean16 = jsonPointer9.equals((java.lang.Object) jsonPointer11);
        java.lang.String str17 = jsonPointer9.getMatchingProperty();
        java.lang.Class<?> wildcardClass18 = jsonPointer9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonPointer8.equals((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.mayMatchProperty();
        boolean boolean10 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer8.matchElement(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonPointer12._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        int int8 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.tail();
        java.lang.String str11 = jsonPointer0._matchingPropertyName;
        int int12 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0._asString;
        java.lang.String str4 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1._nextSegment;
        java.lang.Class<?> wildcardClass10 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3._matchingPropertyName;
        java.lang.String str11 = jsonPointer3._asString;
        boolean boolean12 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer3.matchElement((int) 'a');
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        java.lang.String str16 = jsonPointer15._matchingPropertyName;
        java.lang.String str17 = jsonPointer15.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        java.lang.String str9 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = jsonPointer11.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str5 = jsonPointer3._asString;
        java.lang.String str6 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchElement((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonPointer8._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        java.lang.String str7 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchElement((int) (short) 100);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        boolean boolean9 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2.tail();
        java.lang.String str12 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean14 = jsonPointer13.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean13 = jsonPointer7.equals((java.lang.Object) jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.matchElement((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonPointer15.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer2._asString;
        boolean boolean13 = jsonPointer2.matches();
        int int14 = jsonPointer2._matchingElementIndex;
        java.lang.Class<?> wildcardClass15 = jsonPointer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean8 = jsonPointer7.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        boolean boolean12 = jsonPointer9.mayMatchProperty();
        int int13 = jsonPointer9.getMatchingIndex();
        boolean boolean14 = jsonPointer7.equals((java.lang.Object) jsonPointer9);
        boolean boolean15 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        boolean boolean17 = jsonPointer0.equals((java.lang.Object) jsonPointer9);
        java.lang.String str18 = jsonPointer0.getMatchingProperty();
        boolean boolean19 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        int int6 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.matchProperty("hi!");
        int int13 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        boolean boolean16 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer9._nextSegment;
        java.lang.String str18 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer9);
        boolean boolean20 = jsonPointer1.equals((java.lang.Object) jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str22 = jsonPointer21._matchingPropertyName;
        boolean boolean23 = jsonPointer21.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21._nextSegment;
        java.lang.String str25 = jsonPointer21.toString();
        boolean boolean26 = jsonPointer21.mayMatchProperty();
        boolean boolean27 = jsonPointer1.equals((java.lang.Object) boolean26);
        java.lang.Class<?> wildcardClass28 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean3 = jsonPointer0.equals((java.lang.Object) (short) 1);
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) ' ');
        java.lang.String str7 = jsonPointer0._matchingPropertyName;
        boolean boolean8 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        boolean boolean18 = jsonPointer14.mayMatchElement();
        int int19 = jsonPointer14.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer14);
        boolean boolean21 = jsonPointer20.mayMatchProperty();
        boolean boolean22 = jsonPointer20.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        boolean boolean24 = jsonPointer3.equals((java.lang.Object) jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer3.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = jsonPointer26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer26);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str9 = jsonPointer8._matchingPropertyName;
        java.lang.String str10 = jsonPointer8.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.tail();
        java.lang.String str12 = jsonPointer8.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        java.lang.String str8 = jsonPointer4.toString();
        boolean boolean9 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        java.lang.String str13 = jsonPointer4.getMatchingProperty();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        java.lang.String str14 = jsonPointer11._asString;
        int int15 = jsonPointer11.getMatchingIndex();
        java.lang.String str16 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.matchElement((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        int int6 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        boolean boolean15 = jsonPointer14.mayMatchProperty();
        java.lang.String str16 = jsonPointer14._asString;
        java.lang.Class<?> wildcardClass17 = jsonPointer14.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str17 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int19 = jsonPointer18.getMatchingIndex();
        boolean boolean20 = jsonPointer2.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean24 = jsonPointer23.mayMatchElement();
        java.lang.String str25 = jsonPointer23._asString;
        boolean boolean26 = jsonPointer23.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer23);
        java.lang.String str28 = jsonPointer27._asString;
        boolean boolean29 = jsonPointer27.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27._nextSegment;
        boolean boolean31 = jsonPointer2.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer32.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jsonPointer32);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.tail();
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        boolean boolean14 = jsonPointer10.mayMatchElement();
        int int15 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10._nextSegment;
        boolean boolean18 = jsonPointer4.equals((java.lang.Object) jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        boolean boolean20 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        boolean boolean22 = jsonPointer10.matches();
        int int23 = jsonPointer10.getMatchingIndex();
        java.lang.String str24 = jsonPointer10._matchingPropertyName;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        java.lang.String str16 = jsonPointer1.toString();
        java.lang.String str17 = jsonPointer1.toString();
        boolean boolean18 = jsonPointer1.mayMatchElement();
        boolean boolean19 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        int int14 = jsonPointer13.getMatchingIndex();
        java.lang.String str15 = jsonPointer13.toString();
        java.lang.String str16 = jsonPointer13._asString;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        boolean boolean3 = jsonPointer0.mayMatchElement();
        int int4 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        boolean boolean5 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int11 = jsonPointer10.getMatchingIndex();
        boolean boolean12 = jsonPointer10.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonPointer8.equals((java.lang.Object) jsonPointer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        java.lang.String str18 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        int int20 = jsonPointer15.getMatchingIndex();
        int int21 = jsonPointer15._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer15.tail();
        java.lang.String str23 = jsonPointer15._matchingPropertyName;
        boolean boolean24 = jsonPointer15.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        java.lang.Class<?> wildcardClass4 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        int int6 = jsonPointer1._matchingElementIndex;
        java.lang.String str7 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonPointer4._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0._asString;
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        java.lang.String str7 = jsonPointer0.getMatchingProperty();
        boolean boolean8 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer0.matchElement(0);
        boolean boolean17 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str8 = jsonPointer7._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.matchProperty("");
        int int11 = jsonPointer7._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        java.lang.String str10 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer13.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        java.lang.String str6 = jsonPointer4._asString;
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        boolean boolean9 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10.matchProperty("hi!");
        int int14 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer10.tail();
        boolean boolean16 = jsonPointer8.equals((java.lang.Object) jsonPointer10);
        boolean boolean17 = jsonPointer10.mayMatchElement();
        boolean boolean18 = jsonPointer10.matches();
        java.lang.String str19 = jsonPointer10._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        java.lang.String str21 = jsonPointer20.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        java.lang.String str23 = jsonPointer21._asString;
        java.lang.String str24 = jsonPointer21.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer21.tail();
        java.lang.String str26 = jsonPointer21.getMatchingProperty();
        int int27 = jsonPointer21._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer6._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer6.matchElement((int) 'a');
        java.lang.String str18 = jsonPointer6.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer6._nextSegment;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.tail();
        boolean boolean6 = jsonPointer1.matches();
        java.lang.String str7 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean8 = jsonPointer7.matches();
        java.lang.Class<?> wildcardClass9 = jsonPointer7.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3.tail();
        java.lang.String str5 = jsonPointer3.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        int int4 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        int int8 = jsonPointer2._matchingElementIndex;
        int int9 = jsonPointer2._matchingElementIndex;
        java.lang.String str10 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str19 = jsonPointer18._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer20._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = jsonPointer14.equals((java.lang.Object) jsonPointer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        boolean boolean12 = jsonPointer8.mayMatchElement();
        int int13 = jsonPointer8.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer8._nextSegment;
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        java.lang.Class<?> wildcardClass18 = jsonPointer8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean7 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.matchProperty("hi!");
        int int12 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.tail();
        boolean boolean14 = jsonPointer6.equals((java.lang.Object) jsonPointer8);
        boolean boolean15 = jsonPointer8.mayMatchElement();
        boolean boolean16 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer8.tail();
        java.lang.String str18 = jsonPointer8._asString;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean7 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.matchProperty("hi!");
        int int12 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.tail();
        boolean boolean14 = jsonPointer6.equals((java.lang.Object) jsonPointer8);
        boolean boolean15 = jsonPointer8.mayMatchElement();
        boolean boolean16 = jsonPointer8.matches();
        boolean boolean17 = jsonPointer8.matches();
        java.lang.String str18 = jsonPointer8._asString;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        java.lang.String str14 = jsonPointer10.getMatchingProperty();
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        boolean boolean16 = jsonPointer10.mayMatchElement();
        java.lang.String str17 = jsonPointer10._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer10.matchElement((int) '4');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        int int13 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonPointer15._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        boolean boolean12 = jsonPointer8.mayMatchElement();
        int int13 = jsonPointer8.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer8._nextSegment;
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        boolean boolean18 = jsonPointer8.matches();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        java.lang.String str9 = jsonPointer3.toString();
        boolean boolean10 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jsonPointer2.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        boolean boolean15 = jsonPointer10.mayMatchElement();
        java.lang.String str16 = jsonPointer10.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10._nextSegment;
        boolean boolean18 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean22 = jsonPointer21.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        int int24 = jsonPointer23._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23.tail();
        boolean boolean26 = jsonPointer23.mayMatchProperty();
        int int27 = jsonPointer23.getMatchingIndex();
        boolean boolean28 = jsonPointer21.equals((java.lang.Object) jsonPointer23);
        java.lang.String str29 = jsonPointer21._matchingPropertyName;
        java.lang.String str30 = jsonPointer21.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer21.matchProperty("hi!");
        boolean boolean34 = jsonPointer21.mayMatchProperty();
        java.lang.String str35 = jsonPointer21._asString;
        boolean boolean36 = jsonPointer10.equals((java.lang.Object) jsonPointer21);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        boolean boolean18 = jsonPointer14.mayMatchElement();
        int int19 = jsonPointer14.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer14);
        boolean boolean21 = jsonPointer20.mayMatchProperty();
        boolean boolean22 = jsonPointer20.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        boolean boolean24 = jsonPointer3.equals((java.lang.Object) jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer3.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = jsonPointer26.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer26);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        java.lang.String str3 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int8 = jsonPointer7.getMatchingIndex();
        java.lang.String str9 = jsonPointer7._matchingPropertyName;
        boolean boolean10 = jsonPointer7.mayMatchProperty();
        boolean boolean11 = jsonPointer7.mayMatchProperty();
        java.lang.String str12 = jsonPointer7._matchingPropertyName;
        int int13 = jsonPointer7.getMatchingIndex();
        boolean boolean14 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer15.tail();
        boolean boolean17 = jsonPointer1.equals((java.lang.Object) jsonPointer15);
        boolean boolean18 = jsonPointer15.matches();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        java.lang.String str16 = jsonPointer1.toString();
        boolean boolean17 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchElement((int) (short) 0);
        int int7 = jsonPointer1._matchingElementIndex;
        java.lang.String str8 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        boolean boolean6 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 1);
        boolean boolean11 = jsonPointer8.matches();
        java.lang.String str12 = jsonPointer8.getMatchingProperty();
        boolean boolean13 = jsonPointer8.mayMatchElement();
        boolean boolean14 = jsonPointer5.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean16 = jsonPointer15.matches();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3.tail();
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        boolean boolean6 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean10 = jsonPointer9.matches();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0.toString();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        int int8 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchElement((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer10.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        int int11 = jsonPointer5.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer22);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer22);
        java.lang.String str25 = jsonPointer24.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer24);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer26.tail();
        java.lang.String str28 = jsonPointer26._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer26.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer26);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer31._nextSegment;
        boolean boolean33 = jsonPointer5.equals((java.lang.Object) jsonPointer32);
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer32);
        java.lang.String str35 = jsonPointer32.getMatchingProperty();
        boolean boolean36 = jsonPointer32.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertNotNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        boolean boolean13 = jsonPointer9.matches();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonPointer17.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer17);
        boolean boolean19 = jsonPointer13.equals((java.lang.Object) jsonPointer18);
        boolean boolean20 = jsonPointer0.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str23 = jsonPointer22._matchingPropertyName;
        boolean boolean24 = jsonPointer22.mayMatchElement();
        java.lang.String str25 = jsonPointer22._matchingPropertyName;
        boolean boolean26 = jsonPointer22.mayMatchProperty();
        java.lang.String str27 = jsonPointer22._asString;
        boolean boolean28 = jsonPointer13.equals((java.lang.Object) jsonPointer22);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean30 = jsonPointer29.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer();
        int int32 = jsonPointer31._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer31.tail();
        boolean boolean34 = jsonPointer31.mayMatchProperty();
        int int35 = jsonPointer31.getMatchingIndex();
        boolean boolean36 = jsonPointer29.equals((java.lang.Object) jsonPointer31);
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer29._nextSegment;
        boolean boolean38 = jsonPointer22.equals((java.lang.Object) jsonPointer37);
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer42 = jsonPointer40.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer44 = jsonPointer40.matchElement((int) ' ');
        java.lang.String str45 = jsonPointer40._matchingPropertyName;
        int int46 = jsonPointer40.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer48 = jsonPointer40.matchElement((-1));
        com.fasterxml.jackson.core.JsonPointer jsonPointer49 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str50 = jsonPointer49._matchingPropertyName;
        boolean boolean51 = jsonPointer49.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer53 = jsonPointer49.matchElement((int) 'a');
        boolean boolean54 = jsonPointer40.equals((java.lang.Object) jsonPointer49);
        com.fasterxml.jackson.core.JsonPointer jsonPointer55 = jsonPointer40.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer56 = jsonPointer40.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = jsonPointer37.equals((java.lang.Object) jsonPointer40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonPointer40);
        org.junit.Assert.assertNull(jsonPointer42);
        org.junit.Assert.assertNull(jsonPointer44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(jsonPointer48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(jsonPointer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(jsonPointer55);
        org.junit.Assert.assertNull(jsonPointer56);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str9 = jsonPointer8._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.matchElement((int) ' ');
        java.lang.String str20 = jsonPointer15._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        java.lang.String str22 = jsonPointer21.getMatchingProperty();
        java.lang.String str23 = jsonPointer21.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer21);
        boolean boolean25 = jsonPointer8.equals((java.lang.Object) jsonPointer21);
        boolean boolean26 = jsonPointer21.mayMatchProperty();
        java.lang.Class<?> wildcardClass27 = jsonPointer21.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean7 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        int int12 = jsonPointer8.getMatchingIndex();
        boolean boolean13 = jsonPointer6.equals((java.lang.Object) jsonPointer8);
        java.lang.String str14 = jsonPointer6.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer6);
        java.lang.String str16 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer15.matchElement(0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.matchElement((int) (short) 1);
        boolean boolean23 = jsonPointer20.matches();
        java.lang.String str24 = jsonPointer20.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer20.matchElement((int) (short) -1);
        int int27 = jsonPointer20.getMatchingIndex();
        java.lang.String str28 = jsonPointer20.getMatchingProperty();
        java.lang.String str29 = jsonPointer20._matchingPropertyName;
        boolean boolean30 = jsonPointer15.equals((java.lang.Object) str29);
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str36 = jsonPointer35._matchingPropertyName;
        boolean boolean37 = jsonPointer35.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer35._nextSegment;
        java.lang.String str39 = jsonPointer35.toString();
        boolean boolean40 = jsonPointer35.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer35);
        com.fasterxml.jackson.core.JsonPointer jsonPointer42 = jsonPointer35.tail();
        boolean boolean43 = jsonPointer15.equals((java.lang.Object) jsonPointer42);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(jsonPointer38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(jsonPointer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._asString;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonPointer10.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer10.matchElement((int) (byte) 10);
        java.lang.String str17 = jsonPointer10._asString;
        java.lang.Class<?> wildcardClass18 = jsonPointer10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        java.lang.String str7 = jsonPointer0._asString;
        java.lang.Object obj8 = null;
        boolean boolean9 = jsonPointer0.equals(obj8);
        java.lang.String str10 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        int int5 = jsonPointer1._matchingElementIndex;
        java.lang.String str6 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonPointer7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        boolean boolean6 = jsonPointer0.mayMatchElement();
        java.lang.String str7 = jsonPointer0._matchingPropertyName;
        boolean boolean8 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13._nextSegment;
        boolean boolean15 = jsonPointer13.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int16 = jsonPointer15.getMatchingIndex();
        java.lang.String str17 = jsonPointer15._matchingPropertyName;
        java.lang.String str18 = jsonPointer15._matchingPropertyName;
        boolean boolean19 = jsonPointer11.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        java.lang.Class<?> wildcardClass21 = jsonPointer11.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean8 = jsonPointer7.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        boolean boolean12 = jsonPointer9.mayMatchProperty();
        int int13 = jsonPointer9.getMatchingIndex();
        boolean boolean14 = jsonPointer7.equals((java.lang.Object) jsonPointer9);
        boolean boolean15 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        boolean boolean17 = jsonPointer0.equals((java.lang.Object) jsonPointer9);
        boolean boolean18 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer9.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jsonPointer20.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer3.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7.matchProperty("");
        boolean boolean14 = jsonPointer13.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        boolean boolean3 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = jsonPointer5.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str4 = jsonPointer3._matchingPropertyName;
        int int5 = jsonPointer3.getMatchingIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
        java.lang.String str16 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        int int16 = jsonPointer10.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1.toString();
        java.lang.String str5 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("hi!");
        java.lang.String str14 = jsonPointer11._asString;
        int int15 = jsonPointer11.getMatchingIndex();
        java.lang.String str16 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer11._nextSegment;
        int int18 = jsonPointer17._matchingElementIndex;
        int int19 = jsonPointer17._matchingElementIndex;
        java.lang.Class<?> wildcardClass20 = jsonPointer17.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        java.lang.Class<?> wildcardClass17 = jsonPointer14.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        java.lang.String str12 = jsonPointer0.getMatchingProperty();
        java.lang.String str13 = jsonPointer0.toString();
        int int14 = jsonPointer0.getMatchingIndex();
        boolean boolean15 = jsonPointer0.mayMatchProperty();
        boolean boolean16 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean13 = jsonPointer12.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        boolean boolean23 = jsonPointer12.equals((java.lang.Object) jsonPointer22);
        java.lang.String str24 = jsonPointer22.getMatchingProperty();
        int int25 = jsonPointer22.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.tail();
        java.lang.String str13 = jsonPointer12.toString();
        java.lang.String str14 = jsonPointer12._matchingPropertyName;
        java.lang.String str15 = jsonPointer12._matchingPropertyName;
        int int16 = jsonPointer12.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer12);
        boolean boolean18 = jsonPointer17.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        boolean boolean7 = jsonPointer3.mayMatchProperty();
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        boolean boolean10 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str13 = jsonPointer12._matchingPropertyName;
        boolean boolean14 = jsonPointer12.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12._nextSegment;
        java.lang.String str16 = jsonPointer12.toString();
        boolean boolean17 = jsonPointer3.equals((java.lang.Object) jsonPointer12);
        java.lang.String str18 = jsonPointer12.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer12.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        boolean boolean18 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer22.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer22);
        boolean boolean28 = jsonPointer17.equals((java.lang.Object) jsonPointer27);
        boolean boolean29 = jsonPointer1.equals((java.lang.Object) jsonPointer27);
        int int30 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer27.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(jsonPointer32);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer2.matchProperty("hi!");
        int int21 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer2.matchProperty("hi!");
        java.lang.String str24 = jsonPointer2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        java.lang.String str14 = jsonPointer10.getMatchingProperty();
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10.matchElement(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int14 = jsonPointer13.getMatchingIndex();
        java.lang.String str15 = jsonPointer13._matchingPropertyName;
        java.lang.String str16 = jsonPointer13._matchingPropertyName;
        boolean boolean17 = jsonPointer9.equals((java.lang.Object) jsonPointer13);
        java.lang.String str18 = jsonPointer13.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13.tail();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13.matchProperty("");
        boolean boolean20 = jsonPointer19.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        boolean boolean15 = jsonPointer14.mayMatchElement();
        boolean boolean16 = jsonPointer14.matches();
        boolean boolean17 = jsonPointer14.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        boolean boolean6 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        java.lang.String str6 = jsonPointer3._asString;
        java.lang.Class<?> wildcardClass7 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean18 = jsonPointer14.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass19 = jsonPointer14.getClass();
        boolean boolean20 = jsonPointer1.equals((java.lang.Object) wildcardClass19);
        boolean boolean21 = jsonPointer1.mayMatchElement();
        java.lang.String str22 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = jsonPointer23.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        java.lang.String str9 = jsonPointer0._asString;
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        java.lang.String str7 = jsonPointer0._asString;
        java.lang.Object obj8 = null;
        boolean boolean9 = jsonPointer0.equals(obj8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        java.lang.String str15 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        boolean boolean19 = jsonPointer13.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        java.lang.String str15 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchElement((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer17._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchElement(0);
        java.lang.String str15 = jsonPointer11.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        int int12 = jsonPointer9._matchingElementIndex;
        int int13 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("");
        java.lang.String str16 = jsonPointer9._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean13 = jsonPointer12.matches();
        int int14 = jsonPointer12._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer4.tail();
        int int10 = jsonPointer4._matchingElementIndex;
        int int11 = jsonPointer4._matchingElementIndex;
        java.lang.String str12 = jsonPointer4._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer4.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.matchProperty("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9.getMatchingIndex();
        int int11 = jsonPointer9._matchingElementIndex;
        java.lang.String str12 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonPointer14.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer0._nextSegment;
        java.lang.String str17 = jsonPointer0._asString;
        int int18 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer2.matchProperty("hi!");
        int int21 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer2.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer();
        int int25 = jsonPointer24._matchingElementIndex;
        boolean boolean26 = jsonPointer24.matches();
        java.lang.String str27 = jsonPointer24._asString;
        java.lang.String str28 = jsonPointer24._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer24._nextSegment;
        int int30 = jsonPointer24._matchingElementIndex;
        boolean boolean31 = jsonPointer2.equals((java.lang.Object) jsonPointer24);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer24._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = jsonPointer32.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(jsonPointer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jsonPointer32);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        java.lang.String str16 = jsonPointer1.toString();
        java.lang.String str17 = jsonPointer1.toString();
        java.lang.String str18 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        int int5 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.tail();
        boolean boolean6 = jsonPointer1.matches();
        boolean boolean7 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer4.tail();
        int int10 = jsonPointer4._matchingElementIndex;
        int int11 = jsonPointer4._matchingElementIndex;
        java.lang.String str12 = jsonPointer4._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str15 = jsonPointer14._matchingPropertyName;
        boolean boolean16 = jsonPointer14.mayMatchProperty();
        boolean boolean17 = jsonPointer13.equals((java.lang.Object) boolean16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.Class<?> wildcardClass21 = jsonPointer20.getClass();
        boolean boolean22 = jsonPointer13.equals((java.lang.Object) jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        int int7 = jsonPointer1._matchingElementIndex;
        java.lang.String str8 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1.toString();
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        boolean boolean16 = jsonPointer11.mayMatchElement();
        int int17 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        java.lang.String str19 = jsonPointer11.toString();
        java.lang.Class<?> wildcardClass20 = jsonPointer11.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer8.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchElement((int) (byte) -1);
        java.lang.String str16 = jsonPointer9.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean8 = jsonPointer7.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        boolean boolean12 = jsonPointer9.mayMatchProperty();
        int int13 = jsonPointer9.getMatchingIndex();
        boolean boolean14 = jsonPointer7.equals((java.lang.Object) jsonPointer9);
        boolean boolean15 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        boolean boolean17 = jsonPointer0.equals((java.lang.Object) jsonPointer9);
        boolean boolean18 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer9.matchElement((int) (byte) -1);
        java.lang.String str21 = jsonPointer9._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = jsonPointer11.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9._nextSegment;
        java.lang.Object obj14 = null;
        boolean boolean15 = jsonPointer9.equals(obj14);
        java.lang.String str16 = jsonPointer9._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str9 = jsonPointer8.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchElement(0);
        java.lang.String str15 = jsonPointer11.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        boolean boolean4 = jsonPointer0.matches();
        int int5 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonPointer5.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0._asString;
        java.lang.String str7 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        int int4 = jsonPointer0.getMatchingIndex();
        java.lang.String str5 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = jsonPointer7._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0._matchingPropertyName;
        boolean boolean10 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2.matchProperty("");
        int int15 = jsonPointer2._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        java.lang.String str7 = jsonPointer0.toString();
        int int8 = jsonPointer0._matchingElementIndex;
        int int9 = jsonPointer0.getMatchingIndex();
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        java.lang.String str10 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonPointer12._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        boolean boolean3 = jsonPointer1.mayMatchProperty();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer11.toString();
        java.lang.String str13 = jsonPointer11._matchingPropertyName;
        int int14 = jsonPointer11._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int6 = jsonPointer5.getMatchingIndex();
        java.lang.String str7 = jsonPointer5._matchingPropertyName;
        boolean boolean8 = jsonPointer5.mayMatchProperty();
        boolean boolean9 = jsonPointer5.mayMatchProperty();
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        int int11 = jsonPointer5.getMatchingIndex();
        boolean boolean12 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        java.lang.String str16 = jsonPointer14._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11._nextSegment;
        java.lang.String str17 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean19 = jsonPointer11.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        java.lang.String str18 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        java.lang.String str20 = jsonPointer19.getMatchingProperty();
        boolean boolean21 = jsonPointer19.mayMatchProperty();
        int int22 = jsonPointer19.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1._nextSegment;
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.matches();
        java.lang.String str10 = jsonPointer8.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21.matchElement(100);
        java.lang.String str25 = jsonPointer21._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean10 = jsonPointer3.matches();
        java.lang.Object obj11 = null;
        boolean boolean12 = jsonPointer3.equals(obj11);
        boolean boolean13 = jsonPointer3.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("hi!");
        boolean boolean10 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        boolean boolean8 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) -1);
        java.lang.String str12 = jsonPointer9._asString;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = jsonPointer14._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        int int11 = jsonPointer5.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer22);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer22);
        java.lang.String str25 = jsonPointer24.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer24);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer26.tail();
        java.lang.String str28 = jsonPointer26._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer26.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer26);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer31._nextSegment;
        boolean boolean33 = jsonPointer5.equals((java.lang.Object) jsonPointer32);
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer32);
        java.lang.String str35 = jsonPointer32._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertNotNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        java.lang.Class<?> wildcardClass9 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchElement((int) (short) -1);
        int int10 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer16);
        boolean boolean20 = jsonPointer16.equals((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass21 = jsonPointer16.getClass();
        boolean boolean22 = jsonPointer3.equals((java.lang.Object) wildcardClass21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean24 = jsonPointer23.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23._nextSegment;
        int int26 = jsonPointer23._matchingElementIndex;
        int int27 = jsonPointer23._matchingElementIndex;
        boolean boolean28 = jsonPointer3.equals((java.lang.Object) jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean30 = jsonPointer29.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer4.getClass();
        boolean boolean8 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        boolean boolean9 = jsonPointer1.matches();
        int int10 = jsonPointer1.getMatchingIndex();
        java.lang.String str11 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jsonPointer6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1._nextSegment;
        boolean boolean11 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0.tail();
        int int5 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        int int7 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        java.lang.String str9 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer13.tail();
        java.lang.Class<?> wildcardClass21 = jsonPointer13.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        java.lang.String str11 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2._nextSegment;
        boolean boolean13 = jsonPointer2.matches();
        java.lang.String str14 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean3 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.Class<?> wildcardClass5 = jsonPointer2.getClass();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 1);
        int int7 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer11.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        java.lang.String str14 = jsonPointer13.toString();
        boolean boolean16 = jsonPointer13.equals((java.lang.Object) 0.0d);
        boolean boolean17 = jsonPointer13.mayMatchElement();
        java.lang.String str18 = jsonPointer13._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer13.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.tail();
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        boolean boolean14 = jsonPointer10.mayMatchElement();
        int int15 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10._nextSegment;
        boolean boolean18 = jsonPointer4.equals((java.lang.Object) jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        boolean boolean20 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        boolean boolean22 = jsonPointer10.matches();
        boolean boolean23 = jsonPointer10.mayMatchProperty();
        int int24 = jsonPointer10._matchingElementIndex;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        java.lang.String str9 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        int int13 = jsonPointer2.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer5.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        boolean boolean18 = jsonPointer14.mayMatchElement();
        int int19 = jsonPointer14.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer14);
        boolean boolean21 = jsonPointer20.mayMatchProperty();
        boolean boolean22 = jsonPointer20.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        boolean boolean24 = jsonPointer3.equals((java.lang.Object) jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer3.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer26._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer26);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        java.lang.String str9 = jsonPointer0._asString;
        boolean boolean10 = jsonPointer0.matches();
        boolean boolean11 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        java.lang.String str23 = jsonPointer21._asString;
        java.lang.String str24 = jsonPointer21.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer21.tail();
        java.lang.String str26 = jsonPointer21.getMatchingProperty();
        boolean boolean27 = jsonPointer21.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = jsonPointer15._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2.matchProperty("");
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer16);
        boolean boolean19 = jsonPointer18.mayMatchElement();
        java.lang.String str20 = jsonPointer18.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.tail();
        boolean boolean22 = jsonPointer2.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer25._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        boolean boolean9 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2.tail();
        java.lang.String str12 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2.tail();
        java.lang.String str15 = jsonPointer2._asString;
        java.lang.Class<?> wildcardClass16 = jsonPointer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int1 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) "hi!");
        java.lang.String str10 = jsonPointer0._asString;
        java.lang.Class<?> wildcardClass11 = jsonPointer0.getClass();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        java.lang.String str14 = jsonPointer10.getMatchingProperty();
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        java.lang.String str16 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean20 = jsonPointer19.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        int int25 = jsonPointer21.getMatchingIndex();
        boolean boolean26 = jsonPointer19.equals((java.lang.Object) jsonPointer21);
        java.lang.String str27 = jsonPointer19._matchingPropertyName;
        java.lang.String str28 = jsonPointer19.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer19);
        boolean boolean30 = jsonPointer10.equals((java.lang.Object) "");
        boolean boolean31 = jsonPointer10.matches();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        boolean boolean18 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer22.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer22);
        boolean boolean28 = jsonPointer17.equals((java.lang.Object) jsonPointer27);
        boolean boolean29 = jsonPointer1.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer27.matchElement((int) (short) 0);
        java.lang.String str32 = jsonPointer27.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = jsonPointer7.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        int int5 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int10 = jsonPointer9.getMatchingIndex();
        java.lang.String str11 = jsonPointer9._matchingPropertyName;
        boolean boolean12 = jsonPointer9.mayMatchProperty();
        boolean boolean13 = jsonPointer9.mayMatchProperty();
        java.lang.String str14 = jsonPointer9.toString();
        java.lang.String str15 = jsonPointer9._matchingPropertyName;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonPointer7.equals((java.lang.Object) str15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        int int10 = jsonPointer1.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
        boolean boolean3 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
        java.lang.String str16 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22.matchElement((int) (short) 1);
        boolean boolean25 = jsonPointer22.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer33);
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer33);
        int int36 = jsonPointer35._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer35._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer35);
        boolean boolean39 = jsonPointer38.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer43 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer45 = jsonPointer43.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer47 = jsonPointer43.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer48 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer43);
        boolean boolean49 = jsonPointer38.equals((java.lang.Object) jsonPointer48);
        boolean boolean50 = jsonPointer22.equals((java.lang.Object) jsonPointer48);
        boolean boolean51 = jsonPointer13.equals((java.lang.Object) jsonPointer48);
        com.fasterxml.jackson.core.JsonPointer jsonPointer52 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer53 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer54 = jsonPointer53._nextSegment;
        boolean boolean55 = jsonPointer53.matches();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonPointer43);
        org.junit.Assert.assertNull(jsonPointer45);
        org.junit.Assert.assertNull(jsonPointer47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jsonPointer52);
        org.junit.Assert.assertNotNull(jsonPointer53);
        org.junit.Assert.assertNull(jsonPointer54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.Class<?> wildcardClass7 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchProperty("");
        java.lang.String str9 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean11 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        int int13 = jsonPointer12._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12.tail();
        boolean boolean15 = jsonPointer12.mayMatchProperty();
        int int16 = jsonPointer12.getMatchingIndex();
        boolean boolean17 = jsonPointer10.equals((java.lang.Object) jsonPointer12);
        java.lang.String str18 = jsonPointer10._matchingPropertyName;
        java.lang.String str19 = jsonPointer10.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer10._nextSegment;
        boolean boolean21 = jsonPointer10.matches();
        boolean boolean22 = jsonPointer3.equals((java.lang.Object) boolean21);
        java.lang.String str23 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer3.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = jsonPointer24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(jsonPointer24);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int19 = jsonPointer18.getMatchingIndex();
        java.lang.String str20 = jsonPointer18._matchingPropertyName;
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer18);
        java.lang.String str23 = jsonPointer22.toString();
        java.lang.String str24 = jsonPointer22.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = jsonPointer12.equals((java.lang.Object) jsonPointer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        java.lang.String str9 = jsonPointer3.toString();
        boolean boolean10 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str12 = jsonPointer11._matchingPropertyName;
        boolean boolean13 = jsonPointer11.matches();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        int int7 = jsonPointer0._matchingElementIndex;
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonPointer10.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchElement((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean7 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.matchProperty("hi!");
        int int12 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.tail();
        boolean boolean14 = jsonPointer6.equals((java.lang.Object) jsonPointer8);
        boolean boolean15 = jsonPointer8.mayMatchElement();
        java.lang.String str16 = jsonPointer8._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer8._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchProperty();
        int int2 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        java.lang.String str7 = jsonPointer6.getMatchingProperty();
        boolean boolean8 = jsonPointer6.matches();
        java.lang.String str9 = jsonPointer6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str9 = jsonPointer2.toString();
        java.lang.String str10 = jsonPointer2.toString();
        int int11 = jsonPointer2.getMatchingIndex();
        java.lang.String str12 = jsonPointer2.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3.toString();
        java.lang.String str11 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        int int13 = jsonPointer12.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchElement(10);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11._nextSegment;
        java.lang.String str17 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        java.lang.String str19 = jsonPointer11._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer11._nextSegment;
        boolean boolean21 = jsonPointer20.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3.matchElement((int) '4');
        java.lang.String str7 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchElement((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer9.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.matchProperty("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchProperty("hi!");
        java.lang.String str9 = jsonPointer3._asString;
        boolean boolean10 = jsonPointer3.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str5 = jsonPointer3._asString;
        java.lang.String str6 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.equals((java.lang.Object) (-1.0d));
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) 10.0f);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11.tail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str8 = jsonPointer7.toString();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        int int4 = jsonPointer0.getMatchingIndex();
        int int5 = jsonPointer0.getMatchingIndex();
        java.lang.String str6 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean8 = jsonPointer5.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jsonPointer9.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int6 = jsonPointer5.getMatchingIndex();
        java.lang.String str7 = jsonPointer5._matchingPropertyName;
        boolean boolean8 = jsonPointer5.mayMatchProperty();
        boolean boolean9 = jsonPointer5.mayMatchProperty();
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        int int11 = jsonPointer5.getMatchingIndex();
        boolean boolean12 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean16 = jsonPointer14.matches();
        boolean boolean17 = jsonPointer14.mayMatchElement();
        java.lang.Class<?> wildcardClass18 = jsonPointer14.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        int int4 = jsonPointer1.getMatchingIndex();
        boolean boolean5 = jsonPointer1.matches();
        java.lang.String str6 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchElement(0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14._nextSegment;
        java.lang.String str19 = jsonPointer18.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        boolean boolean12 = jsonPointer8.mayMatchElement();
        int int13 = jsonPointer8.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer8._nextSegment;
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer17.tail();
        java.lang.Class<?> wildcardClass19 = jsonPointer17.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3._matchingPropertyName;
        boolean boolean11 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        int int17 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.tail();
        boolean boolean19 = jsonPointer16.mayMatchProperty();
        int int20 = jsonPointer16.getMatchingIndex();
        boolean boolean21 = jsonPointer14.equals((java.lang.Object) jsonPointer16);
        java.lang.String str22 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean24 = jsonPointer3.equals((java.lang.Object) jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchElement((int) 'a');
        boolean boolean27 = jsonPointer23.mayMatchProperty();
        java.lang.String str28 = jsonPointer23._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer();
        int int30 = jsonPointer29._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer29.matchProperty("hi!");
        int int33 = jsonPointer29._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer29.tail();
        boolean boolean35 = jsonPointer23.equals((java.lang.Object) jsonPointer29);
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer23.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer37);
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean42 = jsonPointer41.mayMatchElement();
        java.lang.String str43 = jsonPointer41._asString;
        boolean boolean44 = jsonPointer41.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer45 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer41);
        boolean boolean46 = jsonPointer45.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer47 = new com.fasterxml.jackson.core.JsonPointer();
        int int48 = jsonPointer47._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer50 = jsonPointer47.matchProperty("hi!");
        int int51 = jsonPointer47._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer52 = jsonPointer47.tail();
        boolean boolean53 = jsonPointer45.equals((java.lang.Object) jsonPointer47);
        boolean boolean54 = jsonPointer47.mayMatchElement();
        boolean boolean55 = jsonPointer47.matches();
        java.lang.String str56 = jsonPointer47._asString;
        java.lang.String str57 = jsonPointer47.toString();
        boolean boolean58 = jsonPointer38.equals((java.lang.Object) str57);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(jsonPointer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(jsonPointer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonPointer14.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        int int8 = jsonPointer1._matchingElementIndex;
        java.lang.String str9 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0._asString;
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2._nextSegment;
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        java.lang.String str9 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str11 = jsonPointer2._matchingPropertyName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        java.lang.String str10 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14.matchElement((int) ' ');
        java.lang.String str19 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer14._nextSegment;
        boolean boolean22 = jsonPointer0.equals((java.lang.Object) jsonPointer21);
        int int23 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        java.lang.String str7 = jsonPointer6.getMatchingProperty();
        boolean boolean8 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        int int15 = jsonPointer11.getMatchingIndex();
        boolean boolean16 = jsonPointer9.equals((java.lang.Object) jsonPointer11);
        java.lang.String str17 = jsonPointer9.getMatchingProperty();
        java.lang.String str18 = jsonPointer9.getMatchingProperty();
        boolean boolean19 = jsonPointer6.equals((java.lang.Object) jsonPointer9);
        boolean boolean20 = jsonPointer9.matches();
        int int21 = jsonPointer9.getMatchingIndex();
        int int22 = jsonPointer9.getMatchingIndex();
        java.lang.String str23 = jsonPointer9.getMatchingProperty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer14._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        java.lang.String str7 = jsonPointer0._asString;
        int int8 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.matchElement((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        boolean boolean9 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2.tail();
        java.lang.String str12 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        java.lang.String str16 = jsonPointer14._asString;
        java.lang.String str17 = jsonPointer14._matchingPropertyName;
        boolean boolean18 = jsonPointer14.mayMatchProperty();
        boolean boolean19 = jsonPointer2.equals((java.lang.Object) jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer14._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = jsonPointer20.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean8 = jsonPointer7.matches();
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) boolean8);
        int int10 = jsonPointer0.getMatchingIndex();
        java.lang.String str11 = jsonPointer0.toString();
        boolean boolean12 = jsonPointer0.mayMatchProperty();
        boolean boolean13 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        java.lang.String str9 = jsonPointer7._asString;
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) str9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.matchElement(100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jsonPointer12._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer10._nextSegment;
        boolean boolean16 = jsonPointer15.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        int int6 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str7 = jsonPointer6.getMatchingProperty();
        java.lang.String str8 = jsonPointer6._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer6.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        int int12 = jsonPointer11.getMatchingIndex();
        java.lang.String str13 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.tail();
        int int15 = jsonPointer11._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str13 = jsonPointer12._matchingPropertyName;
        boolean boolean14 = jsonPointer12.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        boolean boolean22 = jsonPointer18.mayMatchElement();
        int int23 = jsonPointer18.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer18._nextSegment;
        boolean boolean26 = jsonPointer12.equals((java.lang.Object) jsonPointer18);
        java.lang.String str27 = jsonPointer18._asString;
        boolean boolean28 = jsonPointer7.equals((java.lang.Object) jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
        java.lang.String str16 = jsonPointer13._asString;
        java.lang.String str17 = jsonPointer13._asString;
        java.lang.String str18 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean22 = jsonPointer21.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        int int24 = jsonPointer23._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23.tail();
        boolean boolean26 = jsonPointer23.mayMatchProperty();
        int int27 = jsonPointer23.getMatchingIndex();
        boolean boolean28 = jsonPointer21.equals((java.lang.Object) jsonPointer23);
        java.lang.String str29 = jsonPointer21.getMatchingProperty();
        int int30 = jsonPointer21.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer21.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer21.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer21);
        boolean boolean36 = jsonPointer13.equals((java.lang.Object) "hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        java.lang.String str38 = jsonPointer37._asString;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertNull(jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer13.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer18);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        boolean boolean10 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.tail();
        java.lang.String str12 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchElement(100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean12 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer20);
        int int23 = jsonPointer22._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer22);
        boolean boolean26 = jsonPointer25.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer30.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer30.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer30);
        boolean boolean36 = jsonPointer25.equals((java.lang.Object) jsonPointer35);
        int int37 = jsonPointer25._matchingElementIndex;
        boolean boolean38 = jsonPointer2.equals((java.lang.Object) int37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertNull(jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        java.lang.String str2 = jsonPointer0.toString();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer();
        int int9 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        boolean boolean12 = jsonPointer8.mayMatchElement();
        int int13 = jsonPointer8.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer8._nextSegment;
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer17.tail();
        java.lang.String str19 = jsonPointer18._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.matchProperty("hi!");
        java.lang.String str22 = jsonPointer18._matchingPropertyName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        java.lang.String str18 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        int int20 = jsonPointer15.getMatchingIndex();
        int int21 = jsonPointer15._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer15.tail();
        int int23 = jsonPointer15.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 1);
        int int31 = jsonPointer30.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer30);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer30);
        java.lang.String str34 = jsonPointer33._matchingPropertyName;
        boolean boolean35 = jsonPointer15.equals((java.lang.Object) str34);
        boolean boolean36 = jsonPointer15.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str9 = jsonPointer2._asString;
        int int10 = jsonPointer2._matchingElementIndex;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        boolean boolean8 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4.matchProperty("hi!");
        int int8 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4.matchProperty("hi!");
        boolean boolean11 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer4.tail();
        java.lang.String str14 = jsonPointer4.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        java.lang.String str17 = jsonPointer4.getMatchingProperty();
        boolean boolean18 = jsonPointer4.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        boolean boolean15 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str18 = jsonPointer17._matchingPropertyName;
        boolean boolean19 = jsonPointer17.mayMatchElement();
        boolean boolean20 = jsonPointer17.mayMatchProperty();
        int int21 = jsonPointer17._matchingElementIndex;
        boolean boolean22 = jsonPointer10.equals((java.lang.Object) jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer10.tail();
        java.lang.String str24 = jsonPointer23._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = jsonPointer25._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0.toString();
        int int7 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer6.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        boolean boolean4 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean6 = jsonPointer5.mayMatchElement();
        java.lang.String str7 = jsonPointer5._asString;
        java.lang.String str8 = jsonPointer5._matchingPropertyName;
        boolean boolean9 = jsonPointer5.mayMatchProperty();
        boolean boolean10 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5.matchProperty("");
        boolean boolean13 = jsonPointer0.equals((java.lang.Object) jsonPointer12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer15.tail();
        java.lang.String str17 = jsonPointer15._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        java.lang.Class<?> wildcardClass22 = jsonPointer21.getClass();
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3.toString();
        java.lang.String str11 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        java.lang.String str13 = jsonPointer12._asString;
        boolean boolean14 = jsonPointer12.matches();
        boolean boolean15 = jsonPointer12.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        boolean boolean7 = jsonPointer3.mayMatchProperty();
        boolean boolean8 = jsonPointer3.mayMatchProperty();
        int int9 = jsonPointer3._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        java.lang.String str7 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = jsonPointer8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        java.lang.String str8 = jsonPointer4.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer4._nextSegment;
        java.lang.String str10 = jsonPointer4.getMatchingProperty();
        java.lang.String str11 = jsonPointer4._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        boolean boolean14 = jsonPointer13.mayMatchElement();
        boolean boolean15 = jsonPointer13.mayMatchElement();
        java.lang.Class<?> wildcardClass16 = jsonPointer13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer6);
        boolean boolean8 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchElement((int) (short) 1);
        boolean boolean13 = jsonPointer10.matches();
        java.lang.String str14 = jsonPointer10.getMatchingProperty();
        boolean boolean15 = jsonPointer10.mayMatchElement();
        boolean boolean16 = jsonPointer7.equals((java.lang.Object) jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer4.getClass();
        boolean boolean8 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        int int9 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1._nextSegment;
        boolean boolean11 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        java.lang.String str7 = jsonPointer0.toString();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        int int5 = jsonPointer1._matchingElementIndex;
        boolean boolean6 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        boolean boolean14 = jsonPointer9.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer9.matchElement((int) 'a');
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        int int6 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9._nextSegment;
        java.lang.String str15 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer9.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.matchElement((int) (short) 100);
        int int19 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer16._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        java.lang.String str4 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int1 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) "hi!");
        boolean boolean10 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean14 = jsonPointer13.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13._nextSegment;
        int int16 = jsonPointer13._matchingElementIndex;
        int int17 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchProperty("");
        boolean boolean21 = jsonPointer18.mayMatchElement();
        boolean boolean22 = jsonPointer18.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer18.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer24.matchProperty("");
        boolean boolean27 = jsonPointer0.equals((java.lang.Object) "");
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jsonPointer29);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchProperty("hi!");
        boolean boolean12 = jsonPointer1.equals((java.lang.Object) 10.0f);
        int int13 = jsonPointer1.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1.getMatchingProperty();
        java.lang.String str10 = jsonPointer1._matchingPropertyName;
        java.lang.String str11 = jsonPointer1.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str12 = jsonPointer11._matchingPropertyName;
        boolean boolean13 = jsonPointer11.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11._nextSegment;
        java.lang.String str15 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11._nextSegment;
        java.lang.String str17 = jsonPointer11.getMatchingProperty();
        java.lang.String str18 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        boolean boolean21 = jsonPointer20.mayMatchElement();
        java.lang.String str22 = jsonPointer20.getMatchingProperty();
        boolean boolean23 = jsonPointer0.equals((java.lang.Object) str22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        boolean boolean3 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = jsonPointer4.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str7 = jsonPointer6._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6._nextSegment;
        boolean boolean10 = jsonPointer8.equals((java.lang.Object) 1L);
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.matchProperty("hi!");
        java.lang.String str14 = jsonPointer8._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer8._nextSegment;
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer15.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        boolean boolean9 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        java.lang.Class<?> wildcardClass11 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str12 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2.matchProperty("hi!");
        boolean boolean15 = jsonPointer2.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonPointer13._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        boolean boolean15 = jsonPointer14.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean19 = jsonPointer18.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer();
        int int21 = jsonPointer20._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.tail();
        boolean boolean23 = jsonPointer20.mayMatchProperty();
        int int24 = jsonPointer20.getMatchingIndex();
        boolean boolean25 = jsonPointer18.equals((java.lang.Object) jsonPointer20);
        java.lang.String str26 = jsonPointer18._matchingPropertyName;
        java.lang.String str27 = jsonPointer18.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer18.matchProperty("hi!");
        boolean boolean31 = jsonPointer18.mayMatchProperty();
        boolean boolean32 = jsonPointer14.equals((java.lang.Object) jsonPointer18);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer9.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchElement((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) 1);
        boolean boolean9 = jsonPointer6.matches();
        java.lang.String str10 = jsonPointer6.getMatchingProperty();
        boolean boolean11 = jsonPointer6.mayMatchElement();
        boolean boolean12 = jsonPointer3.equals((java.lang.Object) jsonPointer6);
        java.lang.Object obj13 = null;
        boolean boolean14 = jsonPointer6.equals(obj13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        boolean boolean8 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        java.lang.String str12 = jsonPointer4.getMatchingProperty();
        int int13 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer4.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer4.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer4.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer4.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        boolean boolean8 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean10 = jsonPointer9.matches();
        java.lang.String str11 = jsonPointer9.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        java.lang.String str18 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        int int20 = jsonPointer15.getMatchingIndex();
        int int21 = jsonPointer15._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer15.tail();
        java.lang.String str23 = jsonPointer15._matchingPropertyName;
        java.lang.Class<?> wildcardClass24 = jsonPointer15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        int int12 = jsonPointer11.getMatchingIndex();
        boolean boolean13 = jsonPointer11.mayMatchProperty();
        boolean boolean14 = jsonPointer11.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jsonPointer15.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21.matchElement((int) 'a');
        boolean boolean25 = jsonPointer21.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer21._nextSegment;
        java.lang.String str27 = jsonPointer26._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer26.matchElement(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = jsonPointer29.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jsonPointer26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(jsonPointer29);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = jsonPointer2.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        boolean boolean9 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2.tail();
        java.lang.String str12 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean14 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (byte) 1);
        boolean boolean3 = jsonPointer2.mayMatchProperty();
        java.lang.Class<?> wildcardClass4 = jsonPointer2.getClass();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        int int15 = jsonPointer13.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer13.tail();
        java.lang.Class<?> wildcardClass17 = jsonPointer16.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        boolean boolean6 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 1);
        boolean boolean11 = jsonPointer8.matches();
        java.lang.String str12 = jsonPointer8.getMatchingProperty();
        boolean boolean13 = jsonPointer8.mayMatchElement();
        boolean boolean14 = jsonPointer5.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        int int22 = jsonPointer18.getMatchingIndex();
        boolean boolean23 = jsonPointer16.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer18.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer18._nextSegment;
        boolean boolean26 = jsonPointer5.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer18.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(jsonPointer28);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int14 = jsonPointer13.getMatchingIndex();
        java.lang.String str15 = jsonPointer13._matchingPropertyName;
        java.lang.String str16 = jsonPointer13._matchingPropertyName;
        boolean boolean17 = jsonPointer9.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.matchElement((int) (short) 1);
        boolean boolean24 = jsonPointer21.matches();
        java.lang.String str25 = jsonPointer21.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer21.matchProperty("hi!");
        java.lang.String str28 = jsonPointer21._matchingPropertyName;
        boolean boolean29 = jsonPointer21.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean33 = jsonPointer32.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer();
        int int35 = jsonPointer34._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer34.tail();
        boolean boolean37 = jsonPointer34.mayMatchProperty();
        int int38 = jsonPointer34.getMatchingIndex();
        boolean boolean39 = jsonPointer32.equals((java.lang.Object) jsonPointer34);
        java.lang.String str40 = jsonPointer32._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer32);
        boolean boolean42 = jsonPointer21.equals((java.lang.Object) jsonPointer41);
        com.fasterxml.jackson.core.JsonPointer jsonPointer44 = jsonPointer41.matchElement(100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer45 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer44);
        int int46 = jsonPointer45.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer47 = jsonPointer45.tail();
        boolean boolean48 = jsonPointer9.equals((java.lang.Object) jsonPointer45);
        java.lang.String str49 = jsonPointer9.toString();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(jsonPointer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(jsonPointer44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(jsonPointer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        int int10 = jsonPointer0.getMatchingIndex();
        java.lang.String str11 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer0.matchProperty("");
        java.lang.String str14 = jsonPointer0.toString();
        java.lang.String str15 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        java.lang.String str9 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer10._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        java.lang.String str15 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer0._nextSegment;
        java.lang.String str17 = jsonPointer0._asString;
        boolean boolean18 = jsonPointer0.matches();
        int int19 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer6._nextSegment;
        boolean boolean14 = jsonPointer0.equals((java.lang.Object) jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer0.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonPointer16.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer18.matchElement((int) ' ');
        java.lang.String str23 = jsonPointer18._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer18);
        int int25 = jsonPointer24.getMatchingIndex();
        boolean boolean26 = jsonPointer14.equals((java.lang.Object) jsonPointer24);
        int int27 = jsonPointer14._matchingElementIndex;
        boolean boolean28 = jsonPointer14.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer14.tail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonPointer29);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        boolean boolean6 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 1);
        boolean boolean11 = jsonPointer8.matches();
        java.lang.String str12 = jsonPointer8.getMatchingProperty();
        boolean boolean13 = jsonPointer8.mayMatchElement();
        boolean boolean14 = jsonPointer5.equals((java.lang.Object) jsonPointer8);
        boolean boolean15 = jsonPointer8.matches();
        java.lang.String str16 = jsonPointer8._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer8);
        boolean boolean18 = jsonPointer17.matches();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.tail();
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        boolean boolean14 = jsonPointer10.mayMatchElement();
        int int15 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10._nextSegment;
        boolean boolean18 = jsonPointer4.equals((java.lang.Object) jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        boolean boolean20 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        boolean boolean22 = jsonPointer10.matches();
        int int23 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str26 = jsonPointer25._matchingPropertyName;
        boolean boolean27 = jsonPointer25.mayMatchElement();
        boolean boolean28 = jsonPointer25.mayMatchProperty();
        int int29 = jsonPointer25.getMatchingIndex();
        java.lang.Class<?> wildcardClass30 = jsonPointer25.getClass();
        boolean boolean31 = jsonPointer10.equals((java.lang.Object) jsonPointer25);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        int int9 = jsonPointer0.getMatchingIndex();
        java.lang.String str10 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        boolean boolean12 = jsonPointer0.mayMatchElement();
        java.lang.String str13 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer0.matchElement((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        java.lang.String str7 = jsonPointer6.getMatchingProperty();
        boolean boolean8 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        int int15 = jsonPointer11.getMatchingIndex();
        boolean boolean16 = jsonPointer9.equals((java.lang.Object) jsonPointer11);
        java.lang.String str17 = jsonPointer9.getMatchingProperty();
        java.lang.String str18 = jsonPointer9.getMatchingProperty();
        boolean boolean19 = jsonPointer6.equals((java.lang.Object) jsonPointer9);
        boolean boolean20 = jsonPointer9.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer9.matchElement(1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        boolean boolean4 = jsonPointer0.matches();
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        boolean boolean6 = jsonPointer0.mayMatchElement();
        int int7 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        java.lang.String str9 = jsonPointer0._matchingPropertyName;
        java.lang.String str10 = jsonPointer0._asString;
        java.lang.String str11 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean11 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonPointer12._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12.matchElement((int) (short) 1);
        java.lang.String str15 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer12.matchProperty("hi!");
        boolean boolean18 = jsonPointer3.equals((java.lang.Object) jsonPointer12);
        java.lang.String str19 = jsonPointer3._asString;
        java.lang.Class<?> wildcardClass20 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.String str8 = jsonPointer1._asString;
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        boolean boolean10 = jsonPointer1.matches();
        java.lang.String str11 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        java.lang.String str8 = jsonPointer1._asString;
        java.lang.String str9 = jsonPointer1._asString;
        int int10 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str13 = jsonPointer12._asString;
        boolean boolean14 = jsonPointer12.mayMatchElement();
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) boolean14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int14 = jsonPointer13.getMatchingIndex();
        java.lang.String str15 = jsonPointer13._matchingPropertyName;
        java.lang.String str16 = jsonPointer13._matchingPropertyName;
        boolean boolean17 = jsonPointer9.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer9.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer9.matchElement((int) (short) -1);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        boolean boolean9 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2.tail();
        java.lang.String str12 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        java.lang.String str16 = jsonPointer14._asString;
        java.lang.String str17 = jsonPointer14._matchingPropertyName;
        boolean boolean18 = jsonPointer14.mayMatchProperty();
        boolean boolean19 = jsonPointer2.equals((java.lang.Object) jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer14.tail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        java.lang.String str4 = jsonPointer0.toString();
        java.lang.String str5 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchElement(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        boolean boolean10 = jsonPointer6.mayMatchElement();
        int int11 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        boolean boolean13 = jsonPointer12.mayMatchProperty();
        boolean boolean14 = jsonPointer12.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer12.tail();
        boolean boolean17 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str20 = jsonPointer19._matchingPropertyName;
        boolean boolean21 = jsonPointer19.mayMatchElement();
        boolean boolean22 = jsonPointer19.mayMatchProperty();
        int int23 = jsonPointer19._matchingElementIndex;
        boolean boolean24 = jsonPointer12.equals((java.lang.Object) jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer12.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer26._nextSegment;
        java.lang.String str28 = jsonPointer26.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        int int11 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = jsonPointer15._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11._nextSegment;
        java.lang.String str17 = jsonPointer16._matchingPropertyName;
        java.lang.String str18 = jsonPointer16._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer16);
        java.lang.String str20 = jsonPointer16._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2._nextSegment;
        java.lang.String str13 = jsonPointer2.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean16 = jsonPointer2.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        java.lang.String str18 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer19._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer24.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer24.matchElement((int) ' ');
        java.lang.String str29 = jsonPointer24._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer24);
        java.lang.String str31 = jsonPointer30.getMatchingProperty();
        java.lang.String str32 = jsonPointer30.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer30.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer30._nextSegment;
        boolean boolean36 = jsonPointer35.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer35.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = jsonPointer35.matchElement((int) (byte) 0);
        boolean boolean41 = jsonPointer19.equals((java.lang.Object) jsonPointer35);
        java.lang.Class<?> wildcardClass42 = jsonPointer19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertNull(jsonPointer28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertNotNull(jsonPointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(jsonPointer38);
        org.junit.Assert.assertNull(jsonPointer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }
}

