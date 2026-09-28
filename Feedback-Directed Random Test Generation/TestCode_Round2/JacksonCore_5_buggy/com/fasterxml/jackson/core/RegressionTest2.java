package com.fasterxml.jackson.core;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        boolean boolean12 = jsonPointer9.mayMatchProperty();
        boolean boolean13 = jsonPointer9.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer3.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer11.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer9.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = jsonPointer17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean4 = jsonPointer3.mayMatchElement();
        java.lang.String str5 = jsonPointer3._asString;
        java.lang.String str6 = jsonPointer3._asString;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonPointer2.equals((java.lang.Object) jsonPointer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.equals((java.lang.Object) (-1.0d));
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) 10.0f);
        boolean boolean10 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.Class<?> wildcardClass12 = jsonPointer11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        boolean boolean8 = jsonPointer5.matches();
        java.lang.String str9 = jsonPointer5.getMatchingProperty();
        boolean boolean10 = jsonPointer5.mayMatchElement();
        java.lang.String str11 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer5);
        java.lang.String str14 = jsonPointer13._asString;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer6.matchProperty("hi!");
        int int10 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer6.matchProperty("hi!");
        boolean boolean13 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer6._nextSegment;
        java.lang.String str15 = jsonPointer6._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        java.lang.String str17 = jsonPointer16._asString;
        java.lang.String str18 = jsonPointer16.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer16);
        int int21 = jsonPointer20.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer25.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer25.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer25);
        boolean boolean31 = jsonPointer25.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer25._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer25.tail();
        boolean boolean34 = jsonPointer20.equals((java.lang.Object) jsonPointer33);
        int int35 = jsonPointer20._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertNull(jsonPointer29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2._asString;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str8 = jsonPointer7._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonPointer17.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.lang.String str15 = jsonPointer8._asString;
        int int16 = jsonPointer8._matchingElementIndex;
        int int17 = jsonPointer8.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean7 = jsonPointer6.mayMatchElement();
        int int8 = jsonPointer6._matchingElementIndex;
        boolean boolean9 = jsonPointer1.equals((java.lang.Object) int8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str12 = jsonPointer11._matchingPropertyName;
        boolean boolean13 = jsonPointer11.mayMatchElement();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        int int15 = jsonPointer11._matchingElementIndex;
        java.lang.String str16 = jsonPointer11._asString;
        boolean boolean17 = jsonPointer1.equals((java.lang.Object) str16);
        boolean boolean18 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer19._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        int int10 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer11.mayMatchElement();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2.matchProperty("hi!");
        java.lang.Class<?> wildcardClass15 = jsonPointer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        int int6 = jsonPointer4._matchingElementIndex;
        java.lang.Class<?> wildcardClass7 = jsonPointer4.getClass();
        boolean boolean8 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        boolean boolean9 = jsonPointer1.matches();
        int int10 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchElement((int) (short) 0);
        java.lang.String str7 = jsonPointer1._matchingPropertyName;
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        boolean boolean10 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4.matchProperty("hi!");
        int int8 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4.matchProperty("hi!");
        boolean boolean11 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer4._nextSegment;
        java.lang.String str13 = jsonPointer4._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        java.lang.String str15 = jsonPointer14._asString;
        java.lang.String str16 = jsonPointer14.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = jsonPointer19.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchElement((int) (short) 1);
        boolean boolean14 = jsonPointer11.matches();
        java.lang.String str15 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer11.matchProperty("hi!");
        java.lang.String str18 = jsonPointer11._matchingPropertyName;
        java.lang.String str19 = jsonPointer11._asString;
        boolean boolean20 = jsonPointer11.matches();
        boolean boolean21 = jsonPointer1.equals((java.lang.Object) jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer1.matchElement((int) '#');
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        boolean boolean12 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer0.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = jsonPointer14._asString;
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        java.lang.String str15 = jsonPointer13.getMatchingProperty();
        boolean boolean16 = jsonPointer13.mayMatchElement();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean14 = jsonPointer13.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13._nextSegment;
        int int16 = jsonPointer13._matchingElementIndex;
        int int17 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        boolean boolean19 = jsonPointer9.equals((java.lang.Object) "");
        java.lang.String str20 = jsonPointer9._matchingPropertyName;
        boolean boolean21 = jsonPointer9.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        int int7 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchProperty("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16._nextSegment;
        java.lang.String str18 = jsonPointer16.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer19);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        boolean boolean14 = jsonPointer9.mayMatchProperty();
        int int15 = jsonPointer9.getMatchingIndex();
        int int16 = jsonPointer9.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer9.matchElement((int) (short) 1);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2.tail();
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        java.lang.String str12 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        int int24 = jsonPointer2._matchingElementIndex;
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        java.lang.String str21 = jsonPointer4.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str25 = jsonPointer24._matchingPropertyName;
        boolean boolean26 = jsonPointer24.mayMatchElement();
        boolean boolean27 = jsonPointer24.mayMatchProperty();
        int int28 = jsonPointer24.getMatchingIndex();
        boolean boolean29 = jsonPointer24.matches();
        boolean boolean30 = jsonPointer4.equals((java.lang.Object) jsonPointer24);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        int int22 = jsonPointer15.getMatchingIndex();
        int int23 = jsonPointer15._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        boolean boolean20 = jsonPointer18.matches();
        java.lang.String str21 = jsonPointer18.toString();
        boolean boolean23 = jsonPointer18.equals((java.lang.Object) (-1.0d));
        boolean boolean25 = jsonPointer18.equals((java.lang.Object) 10.0f);
        boolean boolean26 = jsonPointer18.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer18);
        boolean boolean28 = jsonPointer3.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonPointer8.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        int int6 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchElement(1);
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        java.lang.String str9 = jsonPointer7._asString;
        java.lang.String str10 = jsonPointer7._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7.matchElement((int) (byte) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        boolean boolean15 = jsonPointer13.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer0.matchElement((int) (byte) 0);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = jsonPointer16.equals(obj17);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
            java.lang.Class<?> wildcardClass8 = jsonPointer7.getClass();
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer54 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean55 = jsonPointer54.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer56 = new com.fasterxml.jackson.core.JsonPointer();
        int int57 = jsonPointer56._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer58 = jsonPointer56.tail();
        boolean boolean59 = jsonPointer56.mayMatchProperty();
        int int60 = jsonPointer56.getMatchingIndex();
        boolean boolean61 = jsonPointer54.equals((java.lang.Object) jsonPointer56);
        java.lang.String str62 = jsonPointer54._matchingPropertyName;
        java.lang.String str63 = jsonPointer54.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer64 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer54);
        com.fasterxml.jackson.core.JsonPointer jsonPointer67 = new com.fasterxml.jackson.core.JsonPointer();
        int int68 = jsonPointer67._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer69 = jsonPointer67.tail();
        boolean boolean70 = jsonPointer67.mayMatchProperty();
        boolean boolean71 = jsonPointer67.mayMatchElement();
        int int72 = jsonPointer67.getMatchingIndex();
        boolean boolean73 = jsonPointer67.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer74 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer67);
        boolean boolean75 = jsonPointer74.matches();
        boolean boolean76 = jsonPointer54.equals((java.lang.Object) boolean75);
        com.fasterxml.jackson.core.JsonPointer jsonPointer81 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer82 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer81);
        boolean boolean83 = jsonPointer82.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer85 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer87 = jsonPointer85.matchElement((int) (short) 1);
        boolean boolean88 = jsonPointer85.matches();
        java.lang.String str89 = jsonPointer85.getMatchingProperty();
        boolean boolean90 = jsonPointer85.mayMatchElement();
        boolean boolean91 = jsonPointer82.equals((java.lang.Object) jsonPointer85);
        boolean boolean92 = jsonPointer85.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer93 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer85);
        boolean boolean94 = jsonPointer54.equals((java.lang.Object) jsonPointer93);
        boolean boolean95 = jsonPointer13.equals((java.lang.Object) boolean94);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(jsonPointer58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNull(jsonPointer69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jsonPointer85);
        org.junit.Assert.assertNull(jsonPointer87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.lang.Class<?> wildcardClass18 = jsonPointer17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer9.matchElement((int) (byte) 1);
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer12.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer12.matchProperty("");
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
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean9 = jsonPointer5.equals((java.lang.Object) 1.0d);
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        int int11 = jsonPointer5._matchingElementIndex;
        int int12 = jsonPointer5.getMatchingIndex();
        boolean boolean13 = jsonPointer5.matches();
        java.lang.String str14 = jsonPointer5.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        java.lang.String str23 = jsonPointer10.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        int int9 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7._nextSegment;
        java.lang.Object obj11 = null;
        boolean boolean12 = jsonPointer7.equals(obj11);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        boolean boolean17 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.Class<?> wildcardClass19 = jsonPointer18.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
            java.lang.String str13 = jsonPointer12._asString;
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        int int10 = jsonPointer1._matchingElementIndex;
        int int11 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        java.lang.String str7 = jsonPointer3._matchingPropertyName;
        int int8 = jsonPointer3._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        int int11 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.matchElement((int) ' ');
        java.lang.String str20 = jsonPointer15._matchingPropertyName;
        java.lang.String str21 = jsonPointer15.toString();
        java.lang.String str22 = jsonPointer15._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer15.matchElement((int) '#');
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer24);
        boolean boolean26 = jsonPointer9.equals((java.lang.Object) jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer25.matchElement((int) (byte) 1);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jsonPointer28);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str8 = jsonPointer7.toString();
        boolean boolean9 = jsonPointer7.mayMatchElement();
        java.lang.Class<?> wildcardClass10 = jsonPointer7.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
            boolean boolean13 = jsonPointer12.mayMatchElement();
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        int int25 = jsonPointer20.getMatchingIndex();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str5 = jsonPointer3._asString;
        java.lang.String str6 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchElement((int) (short) 1);
        java.lang.String str9 = jsonPointer3._asString;
        java.lang.Class<?> wildcardClass10 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        boolean boolean3 = jsonPointer0.matches();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        boolean boolean13 = jsonPointer11.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
        java.lang.String str3 = jsonPointer1.toString();
        java.lang.String str4 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer18._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        int int13 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchElement((int) (short) 0);
        boolean boolean7 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        boolean boolean10 = jsonPointer1.matches();
        boolean boolean11 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        int int7 = jsonPointer1._matchingElementIndex;
        java.lang.String str8 = jsonPointer1._asString;
        int int9 = jsonPointer1.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.matchElement((int) ' ');
        java.lang.String str12 = jsonPointer7._matchingPropertyName;
        java.lang.String str13 = jsonPointer7.getMatchingProperty();
        int int14 = jsonPointer7._matchingElementIndex;
        boolean boolean15 = jsonPointer7.matches();
        boolean boolean16 = jsonPointer1.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2._nextSegment;
        boolean boolean11 = jsonPointer2.equals((java.lang.Object) 1);
        boolean boolean12 = jsonPointer2.mayMatchElement();
        int int13 = jsonPointer2._matchingElementIndex;
        java.lang.String str14 = jsonPointer2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        boolean boolean15 = jsonPointer14.mayMatchElement();
        boolean boolean16 = jsonPointer14.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2.tail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = jsonPointer11.mayMatchElement();
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
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        int int5 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        java.lang.String str6 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        java.lang.String str11 = jsonPointer10.toString();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        java.lang.String str13 = jsonPointer10._matchingPropertyName;
        java.lang.String str14 = jsonPointer10.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        int int6 = jsonPointer1.getMatchingIndex();
        java.lang.String str7 = jsonPointer1.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        boolean boolean15 = jsonPointer11.mayMatchElement();
        int int16 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        boolean boolean18 = jsonPointer17.mayMatchProperty();
        boolean boolean19 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.tail();
        java.lang.String str22 = jsonPointer21._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        boolean boolean26 = jsonPointer1.equals((java.lang.Object) "");
        int int27 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.tail();
        int int15 = jsonPointer14.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        boolean boolean13 = jsonPointer9.mayMatchProperty();
        boolean boolean14 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.tail();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", 0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        boolean boolean18 = jsonPointer0.equals((java.lang.Object) "");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int21 = jsonPointer20.getMatchingIndex();
        java.lang.String str22 = jsonPointer20._matchingPropertyName;
        java.lang.String str23 = jsonPointer20._matchingPropertyName;
        java.lang.String str24 = jsonPointer20.toString();
        boolean boolean25 = jsonPointer0.equals((java.lang.Object) str24);
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (byte) 100);
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
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.tail();
        java.lang.String str13 = jsonPointer12.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        boolean boolean15 = jsonPointer14.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        boolean boolean14 = jsonPointer9.mayMatchProperty();
        boolean boolean15 = jsonPointer9.matches();
        boolean boolean16 = jsonPointer9.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchElement((int) ' ');
        java.lang.String str18 = jsonPointer13._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str20 = jsonPointer19.getMatchingProperty();
        java.lang.String str21 = jsonPointer19.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer19.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer19.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer29.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer29.matchElement((int) ' ');
        java.lang.String str34 = jsonPointer29._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer29);
        java.lang.String str36 = jsonPointer35.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer35.tail();
        boolean boolean38 = jsonPointer19.equals((java.lang.Object) jsonPointer35);
        boolean boolean39 = jsonPointer0.equals((java.lang.Object) jsonPointer35);
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(jsonPointer40);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.Object obj9 = null;
        boolean boolean10 = jsonPointer8.equals(obj9);
        java.lang.String str11 = jsonPointer8._matchingPropertyName;
        int int12 = jsonPointer8.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        boolean boolean14 = jsonPointer0.mayMatchProperty();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.toString();
        int int3 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        boolean boolean17 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("");
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
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        int int7 = jsonPointer1._matchingElementIndex;
        boolean boolean8 = jsonPointer1.mayMatchElement();
        boolean boolean9 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        java.lang.String str20 = jsonPointer6._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str25 = jsonPointer24._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer24._nextSegment;
        int int27 = jsonPointer26._matchingElementIndex;
        java.lang.String str28 = jsonPointer26.getMatchingProperty();
        int int29 = jsonPointer26._matchingElementIndex;
        boolean boolean30 = jsonPointer1.equals((java.lang.Object) jsonPointer26);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer32.matchElement((int) (short) 1);
        boolean boolean35 = jsonPointer32.matches();
        boolean boolean36 = jsonPointer1.equals((java.lang.Object) jsonPointer32);
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
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jsonPointer32);
        org.junit.Assert.assertNull(jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean12 = jsonPointer11.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        boolean boolean14 = jsonPointer11.matches();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        boolean boolean13 = jsonPointer9.equals((java.lang.Object) 1.0d);
        java.lang.String str14 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchProperty("hi!");
        boolean boolean18 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        java.lang.String str20 = jsonPointer19._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean13 = jsonPointer7.equals((java.lang.Object) jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.matchProperty("");
        boolean boolean16 = jsonPointer12.matches();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer22.matchElement((int) (short) -1);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean3 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean6 = jsonPointer5.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer();
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.tail();
        boolean boolean10 = jsonPointer7.mayMatchProperty();
        int int11 = jsonPointer7.getMatchingIndex();
        boolean boolean12 = jsonPointer5.equals((java.lang.Object) jsonPointer7);
        boolean boolean13 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer17);
        boolean boolean19 = jsonPointer5.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer2.equals((java.lang.Object) jsonPointer18);
        int int22 = jsonPointer2.getMatchingIndex();
        java.lang.Class<?> wildcardClass23 = jsonPointer2.getClass();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchElement((int) (short) 1);
        boolean boolean13 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer10.matchElement((int) (short) 0);
        int int16 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonPointer6.equals((java.lang.Object) jsonPointer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str7 = jsonPointer6._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int13 = jsonPointer12.getMatchingIndex();
        java.lang.String str14 = jsonPointer12._matchingPropertyName;
        java.lang.String str15 = jsonPointer12._matchingPropertyName;
        java.lang.String str16 = jsonPointer12.getMatchingProperty();
        int int17 = jsonPointer12._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean19 = jsonPointer18.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer();
        int int21 = jsonPointer20._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.tail();
        boolean boolean23 = jsonPointer20.mayMatchProperty();
        int int24 = jsonPointer20.getMatchingIndex();
        boolean boolean25 = jsonPointer18.equals((java.lang.Object) jsonPointer20);
        boolean boolean26 = jsonPointer18.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer30);
        boolean boolean32 = jsonPointer18.equals((java.lang.Object) jsonPointer31);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer31.tail();
        boolean boolean34 = jsonPointer12.equals((java.lang.Object) jsonPointer31);
        boolean boolean35 = jsonPointer8.equals((java.lang.Object) jsonPointer31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9.getMatchingIndex();
        int int11 = jsonPointer9._matchingElementIndex;
        java.lang.String str12 = jsonPointer9.toString();
        boolean boolean13 = jsonPointer9.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3.tail();
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        int int3 = jsonPointer1.getMatchingIndex();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.getMatchingProperty();
        int int8 = jsonPointer1._matchingElementIndex;
        boolean boolean9 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer6.tail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer7);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.matchElement((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonPointer10._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        int int10 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer1.matchElement((int) (byte) 100);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        java.lang.String str7 = jsonPointer6.getMatchingProperty();
        boolean boolean8 = jsonPointer6.matches();
        int int9 = jsonPointer6._matchingElementIndex;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer3.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer3.matchProperty("");
        int int14 = jsonPointer3._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16._nextSegment;
        java.lang.String str18 = jsonPointer16.toString();
        java.lang.String str19 = jsonPointer16._matchingPropertyName;
        int int20 = jsonPointer16.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        int int10 = jsonPointer3.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        boolean boolean12 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        boolean boolean18 = jsonPointer4.equals((java.lang.Object) jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.tail();
        java.lang.String str20 = jsonPointer17.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        int int22 = jsonPointer17.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        java.lang.String str24 = jsonPointer23._asString;
        java.lang.String str25 = jsonPointer23._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str8 = jsonPointer7.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchProperty("hi!");
        java.lang.String str18 = jsonPointer15._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer15.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer15._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer24.matchElement((int) (short) 1);
        boolean boolean27 = jsonPointer24.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer35);
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer35);
        int int38 = jsonPointer37._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = jsonPointer37._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer37);
        boolean boolean41 = jsonPointer40.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer45 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer47 = jsonPointer45.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer49 = jsonPointer45.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer50 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer45);
        boolean boolean51 = jsonPointer40.equals((java.lang.Object) jsonPointer50);
        boolean boolean52 = jsonPointer24.equals((java.lang.Object) jsonPointer50);
        boolean boolean53 = jsonPointer15.equals((java.lang.Object) jsonPointer50);
        com.fasterxml.jackson.core.JsonPointer jsonPointer54 = jsonPointer15.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer55 = jsonPointer15._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer56 = jsonPointer55._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer57 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = jsonPointer56.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jsonPointer35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jsonPointer45);
        org.junit.Assert.assertNull(jsonPointer47);
        org.junit.Assert.assertNull(jsonPointer49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jsonPointer54);
        org.junit.Assert.assertNotNull(jsonPointer55);
        org.junit.Assert.assertNull(jsonPointer56);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.toString();
        java.lang.String str3 = jsonPointer0._asString;
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        boolean boolean8 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) -1);
        int int12 = jsonPointer9.getMatchingIndex();
        java.lang.String str13 = jsonPointer9._asString;
        boolean boolean14 = jsonPointer9.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        int int7 = jsonPointer1._matchingElementIndex;
        boolean boolean8 = jsonPointer1.mayMatchElement();
        int int9 = jsonPointer1.getMatchingIndex();
        java.lang.String str10 = jsonPointer1.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean10 = jsonPointer3.matches();
        java.lang.Object obj11 = null;
        boolean boolean12 = jsonPointer3.equals(obj11);
        boolean boolean13 = jsonPointer3.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        java.lang.String str30 = jsonPointer1.toString();
        java.lang.String str31 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer1.tail();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(jsonPointer32);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        java.lang.String str9 = jsonPointer0.toString();
        java.lang.String str10 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("");
        java.lang.String str9 = jsonPointer2.toString();
        java.lang.String str10 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        boolean boolean12 = jsonPointer2.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean11 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.tail();
        int int6 = jsonPointer2.getMatchingIndex();
        java.lang.String str7 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2.tail();
        java.lang.String str10 = jsonPointer2._asString;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str8 = jsonPointer7._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean12 = jsonPointer9.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = jsonPointer19.mayMatchElement();
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        int int4 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        boolean boolean21 = jsonPointer11.mayMatchElement();
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer22);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer22);
        int int25 = jsonPointer24._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer24._nextSegment;
        java.lang.String str27 = jsonPointer26.getMatchingProperty();
        int int28 = jsonPointer26._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer26.matchProperty("hi!");
        boolean boolean31 = jsonPointer26.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer26.tail();
        boolean boolean33 = jsonPointer11.equals((java.lang.Object) jsonPointer32);
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
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        boolean boolean8 = jsonPointer5.matches();
        java.lang.String str9 = jsonPointer5.getMatchingProperty();
        boolean boolean10 = jsonPointer5.mayMatchElement();
        java.lang.String str11 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer5.matchElement(0);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        int int6 = jsonPointer5._matchingElementIndex;
        java.lang.String str7 = jsonPointer5.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str9 = jsonPointer8.toString();
        boolean boolean10 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer8.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jsonPointer12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("hi!");
        int int10 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        boolean boolean15 = jsonPointer11.mayMatchElement();
        int int16 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        boolean boolean18 = jsonPointer17.mayMatchProperty();
        boolean boolean19 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer17.matchElement((int) (byte) 10);
        boolean boolean24 = jsonPointer4.equals((java.lang.Object) jsonPointer23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7.matchProperty("");
        java.lang.String str14 = jsonPointer7._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        boolean boolean18 = jsonPointer2.mayMatchElement();
        boolean boolean19 = jsonPointer2.matches();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer14._nextSegment;
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
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.lang.String str20 = jsonPointer11.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        boolean boolean17 = jsonPointer11.matches();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        int int11 = jsonPointer9._matchingElementIndex;
        java.lang.String str12 = jsonPointer9._asString;
        int int13 = jsonPointer9._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        boolean boolean9 = jsonPointer8.matches();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = jsonPointer0.mayMatchElement();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        int int10 = jsonPointer0.getMatchingIndex();
        java.lang.String str11 = jsonPointer0._matchingPropertyName;
        java.lang.Class<?> wildcardClass12 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        boolean boolean19 = jsonPointer13.mayMatchProperty();
        int int20 = jsonPointer13._matchingElementIndex;
        boolean boolean21 = jsonPointer2.equals((java.lang.Object) int20);
        java.lang.String str22 = jsonPointer2.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        int int5 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7.tail();
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
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        boolean boolean15 = jsonPointer6.mayMatchProperty();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.matchProperty("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.matches();
        java.lang.String str5 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        java.lang.String str7 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer9.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNotNull(jsonPointer21);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        int int7 = jsonPointer6._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        int int10 = jsonPointer1._matchingElementIndex;
        java.lang.Object obj11 = null;
        boolean boolean12 = jsonPointer1.equals(obj11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer6.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean19 = jsonPointer18.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer();
        int int21 = jsonPointer20._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.tail();
        boolean boolean23 = jsonPointer20.mayMatchProperty();
        int int24 = jsonPointer20.getMatchingIndex();
        boolean boolean25 = jsonPointer18.equals((java.lang.Object) jsonPointer20);
        java.lang.String str26 = jsonPointer18.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer27.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer30.matchElement((int) ' ');
        boolean boolean33 = jsonPointer6.equals((java.lang.Object) jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(jsonPointer29);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        int int7 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonPointer8._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        java.lang.String str15 = jsonPointer8._asString;
        boolean boolean16 = jsonPointer8.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = jsonPointer0.mayMatchElement();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        int int10 = jsonPointer0.getMatchingIndex();
        java.lang.String str11 = jsonPointer0._matchingPropertyName;
        java.lang.String str12 = jsonPointer0.getMatchingProperty();
        int int13 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        boolean boolean9 = jsonPointer2.mayMatchElement();
        int int10 = jsonPointer2.getMatchingIndex();
        java.lang.String str11 = jsonPointer2._asString;
        int int12 = jsonPointer2.getMatchingIndex();
        int int13 = jsonPointer2.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        int int24 = jsonPointer23.getMatchingIndex();
        boolean boolean25 = jsonPointer23.matches();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int9 = jsonPointer8.getMatchingIndex();
        boolean boolean10 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer8._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer12.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchElement(1);
        java.lang.String str9 = jsonPointer3._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        java.lang.String str12 = jsonPointer11._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("");
        boolean boolean9 = jsonPointer1.mayMatchElement();
        int int10 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer1.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.lang.Class<?> wildcardClass16 = jsonPointer15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        boolean boolean12 = jsonPointer9.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        java.lang.String str14 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        java.lang.String str16 = jsonPointer13.toString();
        java.lang.String str17 = jsonPointer13.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str23 = jsonPointer22._matchingPropertyName;
        boolean boolean24 = jsonPointer22.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer22._nextSegment;
        java.lang.String str26 = jsonPointer22.toString();
        boolean boolean27 = jsonPointer22.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer22);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer28.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer28._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer28.tail();
        int int33 = jsonPointer28._matchingElementIndex;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = jsonPointer19.equals((java.lang.Object) int33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertNotNull(jsonPointer31);
        org.junit.Assert.assertNotNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean13 = jsonPointer7.equals((java.lang.Object) jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.matchProperty("");
        int int16 = jsonPointer15._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer();
        int int16 = jsonPointer15._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        boolean boolean18 = jsonPointer15.mayMatchProperty();
        boolean boolean19 = jsonPointer15.mayMatchElement();
        int int20 = jsonPointer15.getMatchingIndex();
        boolean boolean21 = jsonPointer15.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        boolean boolean23 = jsonPointer22.matches();
        boolean boolean24 = jsonPointer2.equals((java.lang.Object) boolean23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer29);
        boolean boolean31 = jsonPointer30.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer33.matchElement((int) (short) 1);
        boolean boolean36 = jsonPointer33.matches();
        java.lang.String str37 = jsonPointer33.getMatchingProperty();
        boolean boolean38 = jsonPointer33.mayMatchElement();
        boolean boolean39 = jsonPointer30.equals((java.lang.Object) jsonPointer33);
        boolean boolean40 = jsonPointer33.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer33);
        boolean boolean42 = jsonPointer2.equals((java.lang.Object) jsonPointer41);
        com.fasterxml.jackson.core.JsonPointer jsonPointer44 = jsonPointer41.matchElement((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertNull(jsonPointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(jsonPointer44);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        boolean boolean16 = jsonPointer9.matches();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int18 = jsonPointer17.getMatchingIndex();
        java.lang.String str19 = jsonPointer17._matchingPropertyName;
        java.lang.String str20 = jsonPointer17._matchingPropertyName;
        boolean boolean21 = jsonPointer13.equals((java.lang.Object) jsonPointer17);
        boolean boolean22 = jsonPointer17.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer17.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = jsonPointer25.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        boolean boolean14 = jsonPointer9.mayMatchProperty();
        int int15 = jsonPointer9.getMatchingIndex();
        int int16 = jsonPointer9.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer9._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer17);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("");
        boolean boolean14 = jsonPointer11.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.matchElement((int) (byte) 100);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer13.tail();
        int int17 = jsonPointer16.getMatchingIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.tail();
        int int6 = jsonPointer2.getMatchingIndex();
        java.lang.String str7 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer9._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer();
        int int6 = jsonPointer5._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer5.tail();
        java.lang.Class<?> wildcardClass9 = jsonPointer5.getClass();
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonPointer11._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        int int12 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchElement((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = jsonPointer9.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        boolean boolean9 = jsonPointer1.mayMatchElement();
        int int10 = jsonPointer1.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9._nextSegment;
        java.lang.String str15 = jsonPointer14.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer13.matchElement((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = jsonPointer22.matches();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        java.lang.String str7 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchElement((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonPointer9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str8 = jsonPointer7.toString();
        boolean boolean9 = jsonPointer7.mayMatchElement();
        boolean boolean10 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer11);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        int int5 = jsonPointer1._matchingElementIndex;
        boolean boolean6 = jsonPointer1.matches();
        boolean boolean7 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        int int19 = jsonPointer18.getMatchingIndex();
        java.lang.String str20 = jsonPointer18.toString();
        java.lang.String str21 = jsonPointer18.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        boolean boolean10 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonPointer11._asString;
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer1._nextSegment;
        java.lang.String str24 = jsonPointer1._asString;
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
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._asString;
        java.lang.String str6 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement(10);
        boolean boolean9 = jsonPointer0.matches();
        boolean boolean10 = jsonPointer0.mayMatchElement();
        boolean boolean11 = jsonPointer0.mayMatchElement();
        boolean boolean12 = jsonPointer0.mayMatchProperty();
        java.lang.Class<?> wildcardClass13 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        java.lang.String str15 = jsonPointer13._matchingPropertyName;
        boolean boolean16 = jsonPointer13.mayMatchProperty();
        java.lang.String str17 = jsonPointer13.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        java.lang.String str17 = jsonPointer16._matchingPropertyName;
        boolean boolean18 = jsonPointer16.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8._nextSegment;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonPointer10);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        boolean boolean23 = jsonPointer21.equals((java.lang.Object) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str8 = jsonPointer7._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer10._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        int int21 = jsonPointer13.getMatchingIndex();
        boolean boolean22 = jsonPointer13.mayMatchProperty();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0._asString;
        java.lang.String str4 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        java.lang.String str18 = jsonPointer17._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        boolean boolean25 = jsonPointer21.mayMatchElement();
        int int26 = jsonPointer21.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer21);
        java.lang.String str28 = jsonPointer21.toString();
        boolean boolean29 = jsonPointer21.matches();
        java.lang.String str30 = jsonPointer21._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer21._nextSegment;
        boolean boolean32 = jsonPointer17.equals((java.lang.Object) jsonPointer21);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._asString;
        java.lang.String str6 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement(10);
        int int9 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        int int9 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7._nextSegment;
        int int11 = jsonPointer7.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7._nextSegment;
        int int13 = jsonPointer12.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._asString;
        java.lang.String str6 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        java.lang.String str10 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        boolean boolean12 = jsonPointer11.matches();
        int int13 = jsonPointer11._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        java.lang.String str16 = jsonPointer9.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer23._nextSegment;
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
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertNull(jsonPointer27);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        java.lang.String str24 = jsonPointer23.getMatchingProperty();
        java.lang.Class<?> wildcardClass25 = jsonPointer23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer1.tail();
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
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean9 = jsonPointer5.equals((java.lang.Object) 1.0d);
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        int int11 = jsonPointer5._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        java.lang.String str14 = jsonPointer12._asString;
        java.lang.String str15 = jsonPointer12._matchingPropertyName;
        boolean boolean16 = jsonPointer12.mayMatchProperty();
        java.lang.String str17 = jsonPointer12._asString;
        java.lang.String str18 = jsonPointer12._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer12.matchElement(10);
        boolean boolean21 = jsonPointer12.matches();
        boolean boolean22 = jsonPointer12.mayMatchElement();
        boolean boolean23 = jsonPointer12.mayMatchElement();
        boolean boolean24 = jsonPointer12.mayMatchProperty();
        boolean boolean25 = jsonPointer5.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        java.lang.String str8 = jsonPointer1._asString;
        java.lang.String str9 = jsonPointer1._asString;
        int int10 = jsonPointer1.getMatchingIndex();
        java.lang.String str11 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        boolean boolean8 = jsonPointer7.matches();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        java.lang.String str3 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.tail();
        java.lang.String str5 = jsonPointer1.toString();
        java.lang.String str6 = jsonPointer1.getMatchingProperty();
        java.lang.String str7 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        java.lang.String str10 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str12 = jsonPointer11._matchingPropertyName;
        java.lang.Class<?> wildcardClass13 = jsonPointer11.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.matches();
        java.lang.String str10 = jsonPointer8.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.matchElement((-1));
        java.lang.String str7 = jsonPointer4.getMatchingProperty();
        boolean boolean8 = jsonPointer4.matches();
        org.junit.Assert.assertNotNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        boolean boolean6 = jsonPointer0.mayMatchElement();
        java.lang.String str7 = jsonPointer0.toString();
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer1);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer32.tail();
        int int37 = jsonPointer32._matchingElementIndex;
        int int38 = jsonPointer32.getMatchingIndex();
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
        org.junit.Assert.assertNotNull(jsonPointer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0._nextSegment;
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        java.lang.String str7 = jsonPointer0._asString;
        boolean boolean8 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = jsonPointer9.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str7 = jsonPointer6._asString;
        boolean boolean8 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer6._nextSegment;
        java.lang.String str10 = jsonPointer6.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str13 = jsonPointer12._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12._nextSegment;
        boolean boolean16 = jsonPointer14.equals((java.lang.Object) 1L);
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer14.matchProperty("");
        java.lang.String str20 = jsonPointer14._asString;
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer21._nextSegment;
        boolean boolean32 = jsonPointer21.matches();
        boolean boolean33 = jsonPointer14.equals((java.lang.Object) boolean32);
        java.lang.String str34 = jsonPointer14._matchingPropertyName;
        boolean boolean35 = jsonPointer6.equals((java.lang.Object) str34);
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer6.tail();
        java.lang.String str37 = jsonPointer36._asString;
        boolean boolean38 = jsonPointer36.matches();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonPointer36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        java.lang.String str17 = jsonPointer8._asString;
        int int18 = jsonPointer8._matchingElementIndex;
        int int19 = jsonPointer8.getMatchingIndex();
        boolean boolean20 = jsonPointer8.mayMatchProperty();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        java.lang.String str12 = jsonPointer9.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchProperty("hi!");
        java.lang.String str9 = jsonPointer3._asString;
        java.lang.String str10 = jsonPointer3._asString;
        java.lang.String str11 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer3.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        int int9 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.matchElement((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonPointer11._matchingPropertyName;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        int int14 = jsonPointer13.getMatchingIndex();
        java.lang.String str15 = jsonPointer13._matchingPropertyName;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer15.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer15.matchElement((int) (short) 1);
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer15.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.matchElement((int) (short) 1);
        boolean boolean23 = jsonPointer20.matches();
        java.lang.String str24 = jsonPointer20.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer20);
        boolean boolean26 = jsonPointer25.mayMatchProperty();
        boolean boolean27 = jsonPointer25.mayMatchProperty();
        java.lang.String str28 = jsonPointer25._asString;
        boolean boolean29 = jsonPointer16.equals((java.lang.Object) jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        boolean boolean18 = jsonPointer8.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer8.tail();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean3 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        boolean boolean6 = jsonPointer2.matches();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer16);
        boolean boolean21 = jsonPointer20.matches();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        boolean boolean10 = jsonPointer3.matches();
        int int11 = jsonPointer3._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer12._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer17.matchElement((int) (byte) 0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.tail();
        java.lang.Class<?> wildcardClass22 = jsonPointer17.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer18.matchElement((int) (short) 100);
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
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.equals((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        boolean boolean21 = jsonPointer15.equals((java.lang.Object) jsonPointer20);
        boolean boolean22 = jsonPointer2.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer15);
        boolean boolean24 = jsonPointer23.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchProperty("");
        java.lang.String str27 = jsonPointer23._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer6.matchProperty("hi!");
        int int10 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer6.matchProperty("hi!");
        boolean boolean13 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer6._nextSegment;
        java.lang.String str15 = jsonPointer6._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        java.lang.String str17 = jsonPointer16._asString;
        java.lang.String str18 = jsonPointer16.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer16);
        int int21 = jsonPointer20._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer20.matchProperty("");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer24);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        boolean boolean10 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.tail();
        java.lang.String str12 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchElement(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = jsonPointer14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        java.lang.String str11 = jsonPointer10._matchingPropertyName;
        java.lang.Class<?> wildcardClass12 = jsonPointer10.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer15);
        boolean boolean17 = jsonPointer16.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16.matchElement((int) (short) 100);
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        boolean boolean14 = jsonPointer7.mayMatchProperty();
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        boolean boolean6 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        java.lang.String str15 = jsonPointer11.getMatchingProperty();
        java.lang.String str16 = jsonPointer11.toString();
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
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str7 = jsonPointer6.getMatchingProperty();
        boolean boolean8 = jsonPointer6.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean12 = jsonPointer11.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        java.lang.String str15 = jsonPointer11._matchingPropertyName;
        boolean boolean16 = jsonPointer6.equals((java.lang.Object) jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer22);
        java.lang.String str24 = jsonPointer22._asString;
        java.lang.String str25 = jsonPointer22._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer22.matchElement((int) (byte) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer22);
        boolean boolean29 = jsonPointer11.equals((java.lang.Object) jsonPointer22);
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer22.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(jsonPointer31);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str5 = jsonPointer3._asString;
        java.lang.String str6 = jsonPointer3._matchingPropertyName;
        java.lang.Class<?> wildcardClass7 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        boolean boolean3 = jsonPointer0.mayMatchElement();
        java.lang.String str4 = jsonPointer0.toString();
        java.lang.String str5 = jsonPointer0._asString;
        boolean boolean6 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        boolean boolean3 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.matchProperty("hi!");
        boolean boolean7 = jsonPointer1.equals((java.lang.Object) jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonPointer8.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean3 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str8 = jsonPointer7._matchingPropertyName;
        boolean boolean9 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7._nextSegment;
        java.lang.String str11 = jsonPointer7.toString();
        boolean boolean12 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer7);
        boolean boolean14 = jsonPointer4.equals((java.lang.Object) "hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer4.matchElement((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = jsonPointer16._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        java.lang.String str10 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
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
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4._nextSegment;
        int int7 = jsonPointer4._matchingElementIndex;
        int int8 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchProperty("");
        boolean boolean12 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
            com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer25.tail();
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10._nextSegment;
        boolean boolean15 = jsonPointer10.matches();
        boolean boolean16 = jsonPointer10.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        int int3 = jsonPointer1.getMatchingIndex();
        java.lang.String str4 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean9 = jsonPointer5.equals((java.lang.Object) 1.0d);
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        java.lang.String str11 = jsonPointer5.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str8 = jsonPointer7.toString();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        boolean boolean10 = jsonPointer7.mayMatchElement();
        java.lang.String str11 = jsonPointer7._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        boolean boolean8 = jsonPointer3.mayMatchElement();
        java.lang.String str9 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        boolean boolean11 = jsonPointer10.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int14 = jsonPointer13.getMatchingIndex();
        java.lang.String str15 = jsonPointer13._matchingPropertyName;
        java.lang.String str16 = jsonPointer13.toString();
        java.lang.String str17 = jsonPointer13._matchingPropertyName;
        int int18 = jsonPointer13.getMatchingIndex();
        boolean boolean19 = jsonPointer10.equals((java.lang.Object) int18);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        int int11 = jsonPointer9.getMatchingIndex();
        int int12 = jsonPointer9.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchProperty("hi!");
        int int15 = jsonPointer9.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.lang.String str10 = jsonPointer0.getMatchingProperty();
        java.lang.Class<?> wildcardClass11 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jsonPointer3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        java.lang.String str9 = jsonPointer3.toString();
        java.lang.String str10 = jsonPointer3._asString;
        java.lang.String str11 = jsonPointer3._asString;
        int int12 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        boolean boolean14 = jsonPointer13.matches();
        boolean boolean15 = jsonPointer13.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.lang.String str16 = jsonPointer12.getMatchingProperty();
        java.lang.String str17 = jsonPointer12._matchingPropertyName;
        java.lang.String str18 = jsonPointer12._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer12.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.matches();
        java.lang.String str7 = jsonPointer0._asString;
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = jsonPointer24.getClass();
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
        org.junit.Assert.assertNull(jsonPointer24);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchElement((int) ' ');
        java.lang.String str14 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str16 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        boolean boolean18 = jsonPointer3.equals((java.lang.Object) jsonPointer15);
        java.lang.Class<?> wildcardClass19 = jsonPointer3.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        boolean boolean14 = jsonPointer9.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str21 = jsonPointer20._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer22);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer23);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchProperty("hi!");
        boolean boolean27 = jsonPointer9.equals((java.lang.Object) "hi!");
        java.lang.String str28 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer();
        int int34 = jsonPointer33._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer33.tail();
        boolean boolean36 = jsonPointer33.mayMatchProperty();
        boolean boolean37 = jsonPointer33.mayMatchElement();
        int int38 = jsonPointer33.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer33);
        boolean boolean40 = jsonPointer39.mayMatchProperty();
        boolean boolean41 = jsonPointer39.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer42 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer39);
        java.lang.String str43 = jsonPointer39.getMatchingProperty();
        java.lang.String str44 = jsonPointer39._matchingPropertyName;
        boolean boolean45 = jsonPointer9.equals((java.lang.Object) jsonPointer39);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNotNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(jsonPointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str6 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        boolean boolean10 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        java.lang.String str18 = jsonPointer17._asString;
        int int19 = jsonPointer17.getMatchingIndex();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        java.lang.String str15 = jsonPointer14.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int19 = jsonPointer18.getMatchingIndex();
        java.lang.String str20 = jsonPointer18._matchingPropertyName;
        java.lang.String str21 = jsonPointer18._matchingPropertyName;
        boolean boolean22 = jsonPointer14.equals((java.lang.Object) jsonPointer18);
        boolean boolean23 = jsonPointer0.equals((java.lang.Object) jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        int int4 = jsonPointer1.getMatchingIndex();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer23);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int1 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) "hi!");
        boolean boolean10 = jsonPointer0.mayMatchProperty();
        java.lang.Class<?> wildcardClass11 = jsonPointer0.getClass();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        java.lang.String str6 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        int int39 = jsonPointer37._matchingElementIndex;
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = jsonPointer22.mayMatchElement();
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
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str7 = jsonPointer6._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) jsonPointer8);
        int int11 = jsonPointer8._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer17._nextSegment;
        java.lang.String str19 = jsonPointer17._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        java.lang.String str9 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchElement((int) (short) 1);
        boolean boolean14 = jsonPointer11.matches();
        java.lang.String str15 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer11.matchProperty("hi!");
        java.lang.String str18 = jsonPointer11._matchingPropertyName;
        java.lang.String str19 = jsonPointer11._asString;
        boolean boolean20 = jsonPointer11.matches();
        boolean boolean21 = jsonPointer1.equals((java.lang.Object) jsonPointer11);
        java.lang.String str22 = jsonPointer11.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        java.lang.String str10 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        int int14 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str17 = jsonPointer13.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer19);
        java.lang.String str21 = jsonPointer20.toString();
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer16);
        boolean boolean21 = jsonPointer16.mayMatchElement();
        boolean boolean22 = jsonPointer16.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3.tail();
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        boolean boolean14 = jsonPointer9.mayMatchProperty();
        boolean boolean15 = jsonPointer9.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        int int5 = jsonPointer0.getMatchingIndex();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer18._nextSegment;
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
        org.junit.Assert.assertNotNull(jsonPointer19);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1.toString();
        boolean boolean6 = jsonPointer1.matches();
        java.lang.String str7 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer17);
        int int20 = jsonPointer19._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19._nextSegment;
        boolean boolean22 = jsonPointer21.mayMatchProperty();
        int int23 = jsonPointer21.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        boolean boolean25 = jsonPointer21.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer21.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        boolean boolean28 = jsonPointer1.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        java.lang.Class<?> wildcardClass6 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchElement(100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer26);
        boolean boolean28 = jsonPointer27.mayMatchProperty();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        boolean boolean6 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = jsonPointer8.getMatchingIndex();
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        java.lang.String str21 = jsonPointer9.getMatchingProperty();
        java.lang.String str22 = jsonPointer9._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (byte) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.matchElement(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonPointer4._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.matchElement((int) '#');
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer();
        int int16 = jsonPointer15._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        boolean boolean18 = jsonPointer15.mayMatchProperty();
        boolean boolean19 = jsonPointer15.mayMatchElement();
        int int20 = jsonPointer15.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer15);
        boolean boolean22 = jsonPointer21.mayMatchProperty();
        boolean boolean23 = jsonPointer21.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer21.tail();
        java.lang.String str26 = jsonPointer25._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = com.fasterxml.jackson.core.JsonPointer.compile("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean30 = jsonPointer29.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer29._nextSegment;
        boolean boolean32 = jsonPointer28.equals((java.lang.Object) jsonPointer31);
        java.lang.String str33 = jsonPointer28.toString();
        java.lang.String str34 = jsonPointer28._asString;
        boolean boolean35 = jsonPointer25.equals((java.lang.Object) str34);
        java.lang.Class<?> wildcardClass36 = jsonPointer25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = jsonPointer10.equals((java.lang.Object) jsonPointer25);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        int int7 = jsonPointer1._matchingElementIndex;
        boolean boolean8 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str13 = jsonPointer12._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12._nextSegment;
        int int15 = jsonPointer14._matchingElementIndex;
        java.lang.String str16 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.matchProperty("hi!");
        boolean boolean22 = jsonPointer18.mayMatchElement();
        boolean boolean23 = jsonPointer18.mayMatchProperty();
        boolean boolean24 = jsonPointer17.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer18.matchProperty("");
        boolean boolean27 = jsonPointer1.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        int int8 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.getMatchingProperty();
        int int6 = jsonPointer3._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean7 = jsonPointer6.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchElement((int) '#');
        java.lang.Class<?> wildcardClass18 = jsonPointer13.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int11 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str15 = jsonPointer14._matchingPropertyName;
        boolean boolean16 = jsonPointer14.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        boolean boolean19 = jsonPointer10.equals((java.lang.Object) "hi!");
        java.lang.String str20 = jsonPointer10._matchingPropertyName;
        boolean boolean21 = jsonPointer0.equals((java.lang.Object) jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer0.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer2.matchElement((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = jsonPointer16._matchingElementIndex;
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
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        java.lang.String str4 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer();
        int int6 = jsonPointer5._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer5.tail();
        java.lang.Class<?> wildcardClass9 = jsonPointer5.getClass();
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        boolean boolean12 = jsonPointer0.mayMatchElement();
        java.lang.String str13 = jsonPointer0._matchingPropertyName;
        boolean boolean14 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean20 = jsonPointer19.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        int int25 = jsonPointer21.getMatchingIndex();
        boolean boolean26 = jsonPointer19.equals((java.lang.Object) jsonPointer21);
        java.lang.String str27 = jsonPointer19.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer28.matchProperty("hi!");
        java.lang.String str31 = jsonPointer28._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer28.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer28._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer28);
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = jsonPointer37.matchElement((int) (short) 1);
        boolean boolean40 = jsonPointer37.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer48 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer49 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer48);
        com.fasterxml.jackson.core.JsonPointer jsonPointer50 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer48);
        int int51 = jsonPointer50._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer52 = jsonPointer50._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer53 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer50);
        boolean boolean54 = jsonPointer53.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer58 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer60 = jsonPointer58.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer62 = jsonPointer58.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer63 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer58);
        boolean boolean64 = jsonPointer53.equals((java.lang.Object) jsonPointer63);
        boolean boolean65 = jsonPointer37.equals((java.lang.Object) jsonPointer63);
        boolean boolean66 = jsonPointer28.equals((java.lang.Object) jsonPointer63);
        java.lang.String str67 = jsonPointer63._asString;
        boolean boolean68 = jsonPointer0.equals((java.lang.Object) jsonPointer63);
        java.lang.String str69 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertNull(jsonPointer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jsonPointer48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonPointer58);
        org.junit.Assert.assertNull(jsonPointer60);
        org.junit.Assert.assertNull(jsonPointer62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4._nextSegment;
        boolean boolean7 = jsonPointer3.equals((java.lang.Object) jsonPointer6);
        java.lang.String str8 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer17);
        boolean boolean20 = jsonPointer19.mayMatchElement();
        java.lang.String str21 = jsonPointer19.getMatchingProperty();
        boolean boolean22 = jsonPointer19.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        boolean boolean24 = jsonPointer9.equals((java.lang.Object) jsonPointer23);
        int int25 = jsonPointer9.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer2.tail();
        java.lang.String str7 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.matchElement((-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.toString();
        java.lang.String str11 = jsonPointer9._asString;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        boolean boolean15 = jsonPointer0.mayMatchProperty();
        java.lang.String str16 = jsonPointer0._matchingPropertyName;
        int int17 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = jsonPointer17.getMatchingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        int int5 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) (byte) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("");
        boolean boolean10 = jsonPointer3.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        int int6 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.toString();
        java.lang.String str3 = jsonPointer0._asString;
        int int4 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        boolean boolean3 = jsonPointer0.mayMatchElement();
        java.lang.String str4 = jsonPointer0._asString;
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        java.lang.String str9 = jsonPointer7._asString;
        java.lang.String str10 = jsonPointer7._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7.matchElement((int) (byte) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        boolean boolean16 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        boolean boolean7 = jsonPointer3.mayMatchProperty();
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        boolean boolean10 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        java.lang.String str12 = jsonPointer3.toString();
        boolean boolean13 = jsonPointer3.matches();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3.tail();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0.toString();
        int int5 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str4 = jsonPointer3._matchingPropertyName;
        boolean boolean5 = jsonPointer3.mayMatchElement();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.tail();
        boolean boolean8 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        int int10 = jsonPointer9.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        boolean boolean12 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer6.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonPointer15.matches();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        java.lang.String str20 = jsonPointer18.getMatchingProperty();
        int int21 = jsonPointer18.getMatchingIndex();
        int int22 = jsonPointer18._matchingElementIndex;
        boolean boolean23 = jsonPointer10.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer10.tail();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonPointer24);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0._matchingPropertyName;
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) 1.0d);
        int int11 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        int int5 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        int int12 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.matchElement((int) (byte) -1);
        boolean boolean15 = jsonPointer9.mayMatchProperty();
        java.lang.String str16 = jsonPointer9.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2._nextSegment;
        java.lang.String str14 = jsonPointer2._matchingPropertyName;
        boolean boolean15 = jsonPointer2.matches();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean10 = jsonPointer9.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.matchElement((int) (byte) 0);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        int int17 = jsonPointer13.getMatchingIndex();
        int int18 = jsonPointer13._matchingElementIndex;
        boolean boolean19 = jsonPointer13.matches();
        java.lang.String str20 = jsonPointer13.toString();
        int int21 = jsonPointer13.getMatchingIndex();
        int int22 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        int int13 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        java.lang.String str15 = jsonPointer14.toString();
        java.lang.String str16 = jsonPointer14._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2._nextSegment;
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        java.lang.String str9 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        int int11 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonPointer12.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer9.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean16 = jsonPointer15.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15._nextSegment;
        int int18 = jsonPointer15._matchingElementIndex;
        java.lang.String str19 = jsonPointer15._matchingPropertyName;
        java.lang.String str20 = jsonPointer15.getMatchingProperty();
        java.lang.String str21 = jsonPointer15.getMatchingProperty();
        boolean boolean22 = jsonPointer15.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer15.matchProperty("hi!");
        boolean boolean25 = jsonPointer14.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer();
        int int27 = jsonPointer26._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer26.tail();
        boolean boolean29 = jsonPointer26.mayMatchProperty();
        int int30 = jsonPointer26.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer26.tail();
        java.lang.String str32 = jsonPointer26.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer26.matchProperty("");
        boolean boolean35 = jsonPointer26.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer26.matchElement(10);
        boolean boolean38 = jsonPointer15.equals((java.lang.Object) jsonPointer37);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean3 = jsonPointer0.equals((java.lang.Object) (short) 1);
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer();
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.tail();
        boolean boolean10 = jsonPointer7.mayMatchProperty();
        boolean boolean11 = jsonPointer7.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7.matchProperty("hi!");
        java.lang.Class<?> wildcardClass14 = jsonPointer7.getClass();
        boolean boolean15 = jsonPointer0.equals((java.lang.Object) jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer7.matchProperty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        java.lang.String str4 = jsonPointer2.toString();
        java.lang.String str5 = jsonPointer2._asString;
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str8 = jsonPointer7._asString;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) 1);
        boolean boolean9 = jsonPointer6.matches();
        java.lang.String str10 = jsonPointer6.getMatchingProperty();
        boolean boolean11 = jsonPointer6.mayMatchElement();
        boolean boolean12 = jsonPointer3.equals((java.lang.Object) jsonPointer6);
        int int13 = jsonPointer3._matchingElementIndex;
        java.lang.String str14 = jsonPointer3._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer10.matchElement((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonPointer18.mayMatchElement();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer1.matchElement((int) (byte) -1);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        boolean boolean14 = jsonPointer9.mayMatchElement();
        boolean boolean15 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer9.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        int int1 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        boolean boolean9 = jsonPointer0.equals((java.lang.Object) "hi!");
        java.lang.String str10 = jsonPointer0.getMatchingProperty();
        boolean boolean11 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer12.tail();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchElement((int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0._nextSegment;
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        java.lang.String str7 = jsonPointer0._asString;
        boolean boolean8 = jsonPointer0.mayMatchElement();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        int int10 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean11 = jsonPointer7.equals((java.lang.Object) 1.0d);
        java.lang.String str12 = jsonPointer7._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer18);
        boolean boolean29 = jsonPointer13.equals((java.lang.Object) "");
        java.lang.String str30 = jsonPointer13.getMatchingProperty();
        java.lang.String str31 = jsonPointer13._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        boolean boolean8 = jsonPointer2.mayMatchElement();
        boolean boolean9 = jsonPointer2.mayMatchElement();
        int int10 = jsonPointer2.getMatchingIndex();
        java.lang.String str11 = jsonPointer2.toString();
        boolean boolean12 = jsonPointer2.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2._nextSegment;
        boolean boolean14 = jsonPointer2.mayMatchElement();
        java.lang.String str15 = jsonPointer2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement((int) (short) 10);
        int int12 = jsonPointer0._matchingElementIndex;
        boolean boolean13 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean16 = jsonPointer15.matches();
        java.lang.String str17 = jsonPointer15.getMatchingProperty();
        java.lang.String str18 = jsonPointer15._asString;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = jsonPointer14.equals((java.lang.Object) jsonPointer15);
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
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0.matchProperty("");
        boolean boolean5 = jsonPointer0.matches();
        java.lang.Class<?> wildcardClass6 = jsonPointer0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0._matchingElementIndex;
        boolean boolean5 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean18 = jsonPointer17.mayMatchElement();
        java.lang.String str19 = jsonPointer17._asString;
        java.lang.String str20 = jsonPointer17._matchingPropertyName;
        java.lang.String str21 = jsonPointer17.toString();
        java.lang.String str22 = jsonPointer17.getMatchingProperty();
        boolean boolean23 = jsonPointer15.equals((java.lang.Object) str22);
        java.lang.String str24 = jsonPointer15._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean28 = jsonPointer27.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer27._nextSegment;
        int int30 = jsonPointer27._matchingElementIndex;
        int int31 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer32.matchProperty("");
        boolean boolean35 = jsonPointer32.mayMatchElement();
        boolean boolean36 = jsonPointer32.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer32.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = jsonPointer38.matchElement((int) (short) 10);
        boolean boolean41 = jsonPointer15.equals((java.lang.Object) jsonPointer40);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jsonPointer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jsonPointer38);
        org.junit.Assert.assertNull(jsonPointer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        boolean boolean15 = jsonPointer11.matches();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        int int4 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        boolean boolean18 = jsonPointer15.equals((java.lang.Object) 0.0d);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        java.lang.String str20 = jsonPointer19._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer19);
        java.lang.Class<?> wildcardClass22 = jsonPointer21.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        int int17 = jsonPointer8.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer8.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean23 = jsonPointer22.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer();
        int int25 = jsonPointer24._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer24.tail();
        boolean boolean27 = jsonPointer24.mayMatchProperty();
        int int28 = jsonPointer24.getMatchingIndex();
        boolean boolean29 = jsonPointer22.equals((java.lang.Object) jsonPointer24);
        java.lang.String str30 = jsonPointer22.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer22);
        java.lang.String str32 = jsonPointer31.toString();
        boolean boolean34 = jsonPointer31.equals((java.lang.Object) 0.0d);
        java.lang.String str35 = jsonPointer31._asString;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = jsonPointer19.equals((java.lang.Object) str35);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int22 = jsonPointer21.getMatchingIndex();
        java.lang.String str23 = jsonPointer21._matchingPropertyName;
        java.lang.String str24 = jsonPointer21._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = jsonPointer17.equals((java.lang.Object) "hi!");
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
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        java.lang.String str17 = jsonPointer16._asString;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        int int16 = jsonPointer15._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        java.lang.String str19 = jsonPointer15.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer15.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer();
        int int25 = jsonPointer24._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer24.matchProperty("hi!");
        int int28 = jsonPointer24._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer24.matchProperty("hi!");
        boolean boolean31 = jsonPointer24.mayMatchElement();
        java.lang.String str32 = jsonPointer24.getMatchingProperty();
        boolean boolean33 = jsonPointer24.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = jsonPointer37.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = jsonPointer37.matchElement((int) ' ');
        java.lang.String str42 = jsonPointer37._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer43 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer37);
        java.lang.String str44 = jsonPointer43.getMatchingProperty();
        java.lang.String str45 = jsonPointer43.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer47 = jsonPointer43.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer49 = jsonPointer43.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer53 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer55 = jsonPointer53.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer57 = jsonPointer53.matchElement((int) ' ');
        java.lang.String str58 = jsonPointer53._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer59 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer53);
        java.lang.String str60 = jsonPointer59.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer61 = jsonPointer59.tail();
        boolean boolean62 = jsonPointer43.equals((java.lang.Object) jsonPointer59);
        boolean boolean63 = jsonPointer24.equals((java.lang.Object) jsonPointer59);
        com.fasterxml.jackson.core.JsonPointer jsonPointer64 = jsonPointer59.tail();
        boolean boolean65 = jsonPointer59.mayMatchProperty();
        boolean boolean66 = jsonPointer21.equals((java.lang.Object) jsonPointer59);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertNull(jsonPointer39);
        org.junit.Assert.assertNull(jsonPointer41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer47);
        org.junit.Assert.assertNotNull(jsonPointer49);
        org.junit.Assert.assertNotNull(jsonPointer53);
        org.junit.Assert.assertNull(jsonPointer55);
        org.junit.Assert.assertNull(jsonPointer57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(jsonPointer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jsonPointer64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        int int16 = jsonPointer13.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        boolean boolean4 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int11 = jsonPointer10.getMatchingIndex();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        boolean boolean14 = jsonPointer10.mayMatchProperty();
        java.lang.String str15 = jsonPointer10._matchingPropertyName;
        int int16 = jsonPointer10.getMatchingIndex();
        boolean boolean17 = jsonPointer10.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer18.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        boolean boolean21 = jsonPointer3.equals((java.lang.Object) jsonPointer20);
        boolean boolean22 = jsonPointer3.matches();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean11 = jsonPointer7.equals((java.lang.Object) 1.0d);
        java.lang.String str12 = jsonPointer7._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchProperty("hi!");
        boolean boolean16 = jsonPointer13.mayMatchProperty();
        java.lang.String str17 = jsonPointer13.toString();
        boolean boolean18 = jsonPointer13.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11._nextSegment;
        boolean boolean16 = jsonPointer11.mayMatchElement();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer14._nextSegment;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer8.mayMatchProperty();
        boolean boolean10 = jsonPointer8.mayMatchProperty();
        java.lang.String str11 = jsonPointer8._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str20 = jsonPointer19._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19._nextSegment;
        boolean boolean22 = jsonPointer8.equals((java.lang.Object) jsonPointer19);
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
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
            boolean boolean17 = jsonPointer15.matches();
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
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        java.lang.String str14 = jsonPointer13.getMatchingProperty();
        int int15 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer16);
        int int18 = jsonPointer17.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        boolean boolean13 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer7.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer7.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        int int17 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        boolean boolean8 = jsonPointer3.mayMatchElement();
        java.lang.String str9 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        java.lang.String str11 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21._nextSegment;
        boolean boolean24 = jsonPointer23.mayMatchProperty();
        int int25 = jsonPointer23.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer23);
        boolean boolean27 = jsonPointer23.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer23.tail();
        boolean boolean29 = jsonPointer3.equals((java.lang.Object) jsonPointer28);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2._asString;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer9._nextSegment;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        java.lang.String str6 = jsonPointer3._asString;
        boolean boolean7 = jsonPointer3.matches();
        int int8 = jsonPointer3.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int6 = jsonPointer5.getMatchingIndex();
        java.lang.String str7 = jsonPointer5._matchingPropertyName;
        boolean boolean8 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        java.lang.String str10 = jsonPointer9.toString();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        java.lang.String str13 = jsonPointer9.toString();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("");
        boolean boolean9 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        java.lang.String str12 = jsonPointer10.getMatchingProperty();
        java.lang.String str13 = jsonPointer10._matchingPropertyName;
        boolean boolean14 = jsonPointer1.equals((java.lang.Object) jsonPointer10);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        boolean boolean17 = jsonPointer10.matches();
        java.lang.String str18 = jsonPointer10._asString;
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        java.lang.String str38 = jsonPointer13._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.lang.Class<?> wildcardClass27 = jsonPointer26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        java.lang.String str9 = jsonPointer1._matchingPropertyName;
        int int10 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer1.tail();
        java.lang.String str3 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) (short) 10);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str6 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5._nextSegment;
        boolean boolean9 = jsonPointer7.equals((java.lang.Object) 1L);
        boolean boolean10 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer12);
        java.lang.String str14 = jsonPointer13.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        boolean boolean6 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.matches();
        boolean boolean10 = jsonPointer8.matches();
        java.lang.String str11 = jsonPointer8.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer8.matchProperty("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer13);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        boolean boolean22 = jsonPointer1.mayMatchProperty();
        java.lang.Class<?> wildcardClass23 = jsonPointer1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3._nextSegment;
        boolean boolean5 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3._nextSegment;
        int int7 = jsonPointer3.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        int int14 = jsonPointer7._matchingElementIndex;
        int int15 = jsonPointer7._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        java.lang.String str18 = jsonPointer8._asString;
        boolean boolean19 = jsonPointer8.mayMatchElement();
        java.lang.Class<?> wildcardClass20 = jsonPointer8.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean22 = jsonPointer21.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21._nextSegment;
        int int24 = jsonPointer21._matchingElementIndex;
        int int25 = jsonPointer21._matchingElementIndex;
        boolean boolean26 = jsonPointer1.equals((java.lang.Object) jsonPointer21);
        java.lang.String str27 = jsonPointer21._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer21._nextSegment;
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(jsonPointer28);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        java.lang.String str6 = jsonPointer0.toString();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        boolean boolean9 = jsonPointer0.mayMatchElement();
        boolean boolean10 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        boolean boolean13 = jsonPointer9.mayMatchElement();
        int int14 = jsonPointer9._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str8 = jsonPointer7._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.matchElement(0);
        java.lang.Class<?> wildcardClass11 = jsonPointer7.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        java.lang.String str17 = jsonPointer8._asString;
        int int18 = jsonPointer8._matchingElementIndex;
        java.lang.String str19 = jsonPointer8._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.matches();
        java.lang.String str5 = jsonPointer0.toString();
        int int6 = jsonPointer0._matchingElementIndex;
        int int7 = jsonPointer0.getMatchingIndex();
        java.lang.String str8 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer6.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = jsonPointer16.matches();
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
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str6 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7.matchElement((-1));
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        java.lang.Class<?> wildcardClass7 = jsonPointer1.getClass();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        boolean boolean20 = jsonPointer12.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer24);
        boolean boolean26 = jsonPointer12.equals((java.lang.Object) jsonPointer25);
        int int27 = jsonPointer12._matchingElementIndex;
        java.lang.String str28 = jsonPointer12.getMatchingProperty();
        boolean boolean29 = jsonPointer7.equals((java.lang.Object) str28);
        int int30 = jsonPointer7.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        boolean boolean12 = jsonPointer2.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        boolean boolean3 = jsonPointer0.mayMatchElement();
        java.lang.String str4 = jsonPointer0.toString();
        java.lang.String str5 = jsonPointer0._asString;
        boolean boolean6 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        boolean boolean12 = jsonPointer2.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        java.lang.String str19 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer9._nextSegment;
        int int21 = jsonPointer9._matchingElementIndex;
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer10._nextSegment;
        java.lang.String str19 = jsonPointer18._asString;
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
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0._asString;
        java.lang.String str5 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonPointer6.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        boolean boolean7 = jsonPointer3.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchProperty("");
        java.lang.String str14 = jsonPointer11.toString();
        java.lang.String str15 = jsonPointer11._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer0.matchElement(0);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement(0);
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
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        int int5 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer2.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer19.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.matchElement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer();
        int int6 = jsonPointer5._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer5.tail();
        java.lang.Class<?> wildcardClass9 = jsonPointer5.getClass();
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        boolean boolean12 = jsonPointer0.mayMatchElement();
        java.lang.String str13 = jsonPointer0._matchingPropertyName;
        boolean boolean14 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean20 = jsonPointer19.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        int int25 = jsonPointer21.getMatchingIndex();
        boolean boolean26 = jsonPointer19.equals((java.lang.Object) jsonPointer21);
        java.lang.String str27 = jsonPointer19.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer28.matchProperty("hi!");
        java.lang.String str31 = jsonPointer28._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer28.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer28._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer28);
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = jsonPointer37.matchElement((int) (short) 1);
        boolean boolean40 = jsonPointer37.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer48 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer49 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer48);
        com.fasterxml.jackson.core.JsonPointer jsonPointer50 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer48);
        int int51 = jsonPointer50._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer52 = jsonPointer50._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer53 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer50);
        boolean boolean54 = jsonPointer53.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer58 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer60 = jsonPointer58.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer62 = jsonPointer58.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer63 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer58);
        boolean boolean64 = jsonPointer53.equals((java.lang.Object) jsonPointer63);
        boolean boolean65 = jsonPointer37.equals((java.lang.Object) jsonPointer63);
        boolean boolean66 = jsonPointer28.equals((java.lang.Object) jsonPointer63);
        java.lang.String str67 = jsonPointer63._asString;
        boolean boolean68 = jsonPointer0.equals((java.lang.Object) jsonPointer63);
        java.lang.String str69 = jsonPointer63.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertNull(jsonPointer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jsonPointer48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonPointer58);
        org.junit.Assert.assertNull(jsonPointer60);
        org.junit.Assert.assertNull(jsonPointer62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        int int26 = jsonPointer25.getMatchingIndex();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        boolean boolean33 = jsonPointer32.matches();
        boolean boolean34 = jsonPointer32.mayMatchElement();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        int int8 = jsonPointer1.getMatchingIndex();
        java.lang.String str9 = jsonPointer1.getMatchingProperty();
        java.lang.String str10 = jsonPointer1._matchingPropertyName;
        java.lang.String str11 = jsonPointer1.toString();
        int int12 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str14 = jsonPointer13._matchingPropertyName;
        boolean boolean15 = jsonPointer13.mayMatchProperty();
        int int16 = jsonPointer13.getMatchingIndex();
        boolean boolean17 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer9._nextSegment;
        java.lang.String str19 = jsonPointer9._asString;
        java.lang.String str20 = jsonPointer9._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        java.lang.Class<?> wildcardClass12 = jsonPointer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        int int8 = jsonPointer1.getMatchingIndex();
        int int9 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        java.lang.String str15 = jsonPointer4._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer4.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        boolean boolean19 = jsonPointer4.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean11 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonPointer12.getMatchingIndex();
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer6.tail();
        boolean boolean16 = jsonPointer15.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer14.matchElement((int) (byte) 0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer14.matchElement((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = jsonPointer21.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        int int5 = jsonPointer0.getMatchingIndex();
        boolean boolean6 = jsonPointer0.matches();
        java.lang.String str7 = jsonPointer0._asString;
        java.lang.String str8 = jsonPointer0._asString;
        java.lang.Class<?> wildcardClass9 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        int int16 = jsonPointer11._matchingElementIndex;
        boolean boolean17 = jsonPointer11.matches();
        java.lang.String str18 = jsonPointer11.toString();
        int int19 = jsonPointer11.getMatchingIndex();
        int int20 = jsonPointer11._matchingElementIndex;
        java.lang.String str21 = jsonPointer11._asString;
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str6 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchElement((int) ' ');
        java.lang.String str18 = jsonPointer13._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer13.tail();
        boolean boolean21 = jsonPointer8.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer8._nextSegment;
        boolean boolean23 = jsonPointer8.matches();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        boolean boolean16 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15._nextSegment;
        java.lang.String str18 = jsonPointer17.getMatchingProperty();
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
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        boolean boolean12 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        boolean boolean18 = jsonPointer4.equals((java.lang.Object) jsonPointer17);
        boolean boolean19 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        int int6 = jsonPointer0._matchingElementIndex;
        java.lang.String str7 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        java.lang.String str8 = jsonPointer4.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer4._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3._nextSegment;
        boolean boolean5 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jsonPointer6.matches();
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
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer();
        int int6 = jsonPointer5._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer5.tail();
        java.lang.Class<?> wildcardClass9 = jsonPointer5.getClass();
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        boolean boolean12 = jsonPointer0.mayMatchElement();
        java.lang.String str13 = jsonPointer0._matchingPropertyName;
        boolean boolean14 = jsonPointer0.matches();
        java.lang.String str15 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        int int5 = jsonPointer1._matchingElementIndex;
        java.lang.String str6 = jsonPointer1._asString;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.String str8 = jsonPointer1._asString;
        java.lang.String str9 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        boolean boolean8 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.tail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer12);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = jsonPointer21._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer2.tail();
        java.lang.String str7 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        boolean boolean23 = jsonPointer3.mayMatchElement();
        boolean boolean24 = jsonPointer3.matches();
        boolean boolean25 = jsonPointer3.matches();
        boolean boolean26 = jsonPointer3.mayMatchElement();
        int int27 = jsonPointer3._matchingElementIndex;
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        boolean boolean9 = jsonPointer1.mayMatchProperty();
        java.lang.String str10 = jsonPointer1.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer3.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer3.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = jsonPointer13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer6.matchProperty("hi!");
        int int10 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer6.matchProperty("hi!");
        boolean boolean13 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer6._nextSegment;
        java.lang.String str15 = jsonPointer6._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        java.lang.String str17 = jsonPointer16._asString;
        java.lang.String str18 = jsonPointer16.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer16);
        java.lang.String str21 = jsonPointer16._matchingPropertyName;
        boolean boolean22 = jsonPointer16.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1.toString();
        boolean boolean6 = jsonPointer1.matches();
        int int7 = jsonPointer1.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
            com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement(100);
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer8.tail();
        boolean boolean17 = jsonPointer8.matches();
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
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement((int) (short) 100);
        int int12 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer2.matchProperty("hi!");
        int int14 = jsonPointer2.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2.getMatchingProperty();
        java.lang.String str11 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer2.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        int int11 = jsonPointer10.getMatchingIndex();
        int int12 = jsonPointer10._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        int int6 = jsonPointer5._matchingElementIndex;
        java.lang.String str7 = jsonPointer5.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int9 = jsonPointer5.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer5._nextSegment;
        boolean boolean11 = jsonPointer5.matches();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 1);
        int int7 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchElement(0);
        int int14 = jsonPointer9.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23.matchElement((int) (short) 0);
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
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        int int17 = jsonPointer13.getMatchingIndex();
        java.lang.String str18 = jsonPointer13.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((int) (byte) 1);
        boolean boolean9 = jsonPointer0.mayMatchElement();
        java.lang.Class<?> wildcardClass10 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        boolean boolean23 = jsonPointer3.mayMatchElement();
        boolean boolean24 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer3._nextSegment;
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(jsonPointer25);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.String str15 = jsonPointer2.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchElement((int) '#');
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        boolean boolean3 = jsonPointer0.mayMatchElement();
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        boolean boolean7 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = jsonPointer11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.matchElement((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = jsonPointer13.mayMatchProperty();
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
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2._nextSegment;
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        java.lang.String str9 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean11 = jsonPointer10.mayMatchProperty();
        java.lang.String str12 = jsonPointer10.getMatchingProperty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean3 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchElement(10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer5.getMatchingProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        int int17 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16._nextSegment;
        java.lang.String str19 = jsonPointer18.getMatchingProperty();
        int int20 = jsonPointer18.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer18);
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) "");
        boolean boolean23 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str8 = jsonPointer7.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.matchElement((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.lang.String str20 = jsonPointer10.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer10);
        boolean boolean22 = jsonPointer21.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21._nextSegment;
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonPointer23);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        int int8 = jsonPointer1._matchingElementIndex;
        java.lang.String str9 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.tail();
        java.lang.String str11 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        java.lang.String str16 = jsonPointer15._matchingPropertyName;
        boolean boolean17 = jsonPointer15.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        boolean boolean19 = jsonPointer17.mayMatchProperty();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str8 = jsonPointer7.toString();
        java.lang.String str9 = jsonPointer7._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12._matchingPropertyName;
        java.lang.String str21 = jsonPointer12.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer12.matchElement((int) (short) 1);
        int int25 = jsonPointer12._matchingElementIndex;
        boolean boolean26 = jsonPointer7.equals((java.lang.Object) int25);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean12 = jsonPointer11.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13.toString();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        int int7 = jsonPointer0._matchingElementIndex;
        java.lang.String str8 = jsonPointer0._asString;
        java.lang.String str9 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11.tail();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2._nextSegment;
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        java.lang.String str9 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        int int11 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer2.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jsonPointer12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        java.lang.String str7 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer46 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str47 = jsonPointer46._matchingPropertyName;
        boolean boolean48 = jsonPointer46.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer49 = jsonPointer46._nextSegment;
        java.lang.String str50 = jsonPointer46.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer51 = jsonPointer46._nextSegment;
        java.lang.String str52 = jsonPointer46.getMatchingProperty();
        java.lang.String str53 = jsonPointer46._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer54 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer46);
        com.fasterxml.jackson.core.JsonPointer jsonPointer55 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer46);
        java.lang.Class<?> wildcardClass56 = jsonPointer46.getClass();
        boolean boolean57 = jsonPointer19.equals((java.lang.Object) jsonPointer46);
        java.lang.String str58 = jsonPointer19.toString();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(jsonPointer49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(jsonPointer51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        int int5 = jsonPointer0.getMatchingIndex();
        boolean boolean6 = jsonPointer0.matches();
        java.lang.String str7 = jsonPointer0._asString;
        boolean boolean8 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        java.lang.Class<?> wildcardClass23 = jsonPointer21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean24 = jsonPointer23.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer();
        int int26 = jsonPointer25._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer25.tail();
        boolean boolean28 = jsonPointer25.mayMatchProperty();
        int int29 = jsonPointer25.getMatchingIndex();
        boolean boolean30 = jsonPointer23.equals((java.lang.Object) jsonPointer25);
        java.lang.String str31 = jsonPointer23.getMatchingProperty();
        int int32 = jsonPointer23.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer23.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer23.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer23._nextSegment;
        boolean boolean38 = jsonPointer10.equals((java.lang.Object) jsonPointer23);
        int int39 = jsonPointer23._matchingElementIndex;
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(jsonPointer34);
        org.junit.Assert.assertNull(jsonPointer36);
        org.junit.Assert.assertNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        int int24 = jsonPointer1.getMatchingIndex();
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str7 = jsonPointer6._asString;
        boolean boolean8 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer6.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonPointer10);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        int int5 = jsonPointer1._matchingElementIndex;
        java.lang.String str6 = jsonPointer1._asString;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.String str8 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.tail();
        boolean boolean10 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1.getMatchingProperty();
        java.lang.String str4 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int9 = jsonPointer8.getMatchingIndex();
        boolean boolean10 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.tail();
        boolean boolean12 = jsonPointer8.mayMatchProperty();
        int int13 = jsonPointer8._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2._nextSegment;
        int int9 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2._nextSegment;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.lang.String str17 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer2._nextSegment;
        java.lang.String str19 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str22 = jsonPointer21.getMatchingProperty();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchProperty("");
        boolean boolean21 = jsonPointer18.matches();
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
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean11 = jsonPointer7.equals((java.lang.Object) 1.0d);
        java.lang.String str12 = jsonPointer7._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        int int22 = jsonPointer18.getMatchingIndex();
        boolean boolean23 = jsonPointer16.equals((java.lang.Object) jsonPointer18);
        java.lang.String str24 = jsonPointer16.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer25.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer25.tail();
        boolean boolean29 = jsonPointer7.equals((java.lang.Object) jsonPointer25);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertNotNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        java.lang.String str12 = jsonPointer0._asString;
        boolean boolean13 = jsonPointer0.matches();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        java.lang.String str11 = jsonPointer2._asString;
        boolean boolean12 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.tail();
        java.lang.String str11 = jsonPointer8._asString;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        int int11 = jsonPointer1._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.String str15 = jsonPointer13._asString;
        java.lang.String str16 = jsonPointer13._asString;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        int int14 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.tail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        boolean boolean15 = jsonPointer14.matches();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        boolean boolean6 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        boolean boolean13 = jsonPointer0.matches();
        java.lang.String str14 = jsonPointer0._asString;
        java.lang.String str15 = jsonPointer0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer8.tail();
        int int13 = jsonPointer8._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer8.matchElement((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchProperty("hi!");
        boolean boolean12 = jsonPointer1.equals((java.lang.Object) 10.0f);
        boolean boolean13 = jsonPointer1.mayMatchElement();
        java.lang.String str14 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        boolean boolean21 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer1._nextSegment;
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        boolean boolean10 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer15.matchProperty("hi!");
        java.lang.String str22 = jsonPointer15.toString();
        java.lang.String str23 = jsonPointer15._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        int int25 = jsonPointer24.getMatchingIndex();
        boolean boolean26 = jsonPointer11.equals((java.lang.Object) int25);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        boolean boolean12 = jsonPointer2.equals((java.lang.Object) 1.0d);
        java.lang.String str13 = jsonPointer2._matchingPropertyName;
        int int14 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchElement((int) ' ');
        java.lang.String str18 = jsonPointer13._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str20 = jsonPointer19.getMatchingProperty();
        java.lang.String str21 = jsonPointer19.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer19.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer19.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer29.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer29.matchElement((int) ' ');
        java.lang.String str34 = jsonPointer29._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer29);
        java.lang.String str36 = jsonPointer35.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer35.tail();
        boolean boolean38 = jsonPointer19.equals((java.lang.Object) jsonPointer35);
        boolean boolean39 = jsonPointer0.equals((java.lang.Object) jsonPointer35);
        int int40 = jsonPointer35._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.lang.String str13 = jsonPointer2._asString;
        boolean boolean14 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer2.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16.tail();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
            com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer11._nextSegment;
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        boolean boolean11 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
            java.lang.String str13 = jsonPointer12._matchingPropertyName;
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer5._nextSegment;
        boolean boolean7 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer5._nextSegment;
        java.lang.String str9 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean11 = jsonPointer5.matches();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        java.lang.String str5 = jsonPointer1._asString;
        boolean boolean6 = jsonPointer1.matches();
        int int7 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.tail();
        int int9 = jsonPointer1.getMatchingIndex();
        boolean boolean10 = jsonPointer1.mayMatchProperty();
        boolean boolean11 = jsonPointer1.mayMatchElement();
        int int12 = jsonPointer1.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0._asString;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0._nextSegment;
        java.lang.String str6 = jsonPointer0._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        int int4 = jsonPointer0.getMatchingIndex();
        java.lang.String str5 = jsonPointer0._asString;
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }
}

