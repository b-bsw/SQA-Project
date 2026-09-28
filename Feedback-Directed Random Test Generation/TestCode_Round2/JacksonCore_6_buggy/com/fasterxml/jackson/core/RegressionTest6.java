package com.fasterxml.jackson.core;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        boolean boolean9 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.matchProperty("hi!");
        java.lang.String str24 = jsonPointer21._asString;
        java.lang.String str25 = jsonPointer21._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer31.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer31.matchElement((int) ' ');
        java.lang.String str36 = jsonPointer31._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer31);
        java.lang.String str38 = jsonPointer37.getMatchingProperty();
        java.lang.String str39 = jsonPointer37.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = jsonPointer37.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer42 = jsonPointer37._nextSegment;
        java.lang.String str43 = jsonPointer37.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer44 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer37);
        boolean boolean45 = jsonPointer21.equals((java.lang.Object) jsonPointer44);
        boolean boolean46 = jsonPointer1.equals((java.lang.Object) boolean45);
        java.lang.String str47 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(jsonPointer31);
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertNull(jsonPointer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer41);
        org.junit.Assert.assertNotNull(jsonPointer42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str7 = jsonPointer6._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer17);
        int int20 = jsonPointer19._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer19.tail();
        boolean boolean24 = jsonPointer19.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        boolean boolean26 = jsonPointer6.equals((java.lang.Object) "");
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer6._nextSegment;
        java.lang.Class<?> wildcardClass28 = jsonPointer27.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean25 = jsonPointer24.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer();
        int int27 = jsonPointer26._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer26.tail();
        boolean boolean29 = jsonPointer26.mayMatchProperty();
        int int30 = jsonPointer26.getMatchingIndex();
        boolean boolean31 = jsonPointer24.equals((java.lang.Object) jsonPointer26);
        boolean boolean32 = jsonPointer24.mayMatchProperty();
        boolean boolean33 = jsonPointer24.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer24.tail();
        java.lang.String str35 = jsonPointer24._matchingPropertyName;
        boolean boolean36 = jsonPointer2.equals((java.lang.Object) jsonPointer24);
        boolean boolean37 = jsonPointer2.mayMatchElement();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jsonPointer34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean11 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer5.tail();
        java.lang.String str14 = jsonPointer5.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer5.tail();
        int int16 = jsonPointer5.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("~hi!", "", jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~i!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 9, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        boolean boolean24 = jsonPointer18.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer32);
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer32);
        boolean boolean35 = jsonPointer34.mayMatchElement();
        java.lang.String str36 = jsonPointer34.getMatchingProperty();
        boolean boolean37 = jsonPointer34.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer34.tail();
        java.lang.String str39 = jsonPointer38._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer38);
        java.lang.String str41 = jsonPointer38.toString();
        java.lang.String str42 = jsonPointer38.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer44 = jsonPointer38.matchElement((int) (short) 1);
        boolean boolean45 = jsonPointer18.equals((java.lang.Object) jsonPointer38);
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
        org.junit.Assert.assertNotNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jsonPointer38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(jsonPointer44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer10.matchElement(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer13._nextSegment;
        java.lang.String str17 = jsonPointer16.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16.matchElement((int) 'a');
        java.lang.String str20 = jsonPointer16._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        java.lang.String str9 = jsonPointer7._asString;
        boolean boolean10 = jsonPointer0.equals((java.lang.Object) str9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.matchElement(100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        int int20 = jsonPointer19._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.tail();
        boolean boolean22 = jsonPointer19.mayMatchProperty();
        boolean boolean23 = jsonPointer19.mayMatchElement();
        int int24 = jsonPointer19.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer19);
        boolean boolean26 = jsonPointer25.mayMatchProperty();
        boolean boolean27 = jsonPointer25.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer28);
        boolean boolean30 = jsonPointer28.matches();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = jsonPointer12.equals((java.lang.Object) boolean30);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        int int13 = jsonPointer11._matchingElementIndex;
        java.lang.String str14 = jsonPointer11._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer8.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "~i!", jsonPointer8);
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
        org.junit.Assert.assertNull(jsonPointer18);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("");
        int int9 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.matchElement((int) (byte) 0);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonPointer10._matchingElementIndex;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0._asString;
        boolean boolean6 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        int int4 = jsonPointer0._matchingElementIndex;
        boolean boolean5 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.equals((java.lang.Object) (-1.0d));
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) 10.0f);
        boolean boolean10 = jsonPointer2.mayMatchElement();
        boolean boolean11 = jsonPointer2.mayMatchElement();
        int int12 = jsonPointer2.getMatchingIndex();
        java.lang.String str13 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("~hi!", "hi!", jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean3 = jsonPointer0.equals((java.lang.Object) (short) 1);
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        java.lang.String str6 = jsonPointer0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("i!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 96, length 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        java.lang.String str11 = jsonPointer0.toString();
        boolean boolean12 = jsonPointer0.mayMatchProperty();
        java.lang.String str13 = jsonPointer0.getMatchingProperty();
        int int14 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer56 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str57 = jsonPointer56._matchingPropertyName;
        boolean boolean58 = jsonPointer56.mayMatchElement();
        boolean boolean59 = jsonPointer56.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer60 = jsonPointer56.tail();
        boolean boolean61 = jsonPointer56.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer62 = jsonPointer56._nextSegment;
        boolean boolean63 = jsonPointer54.equals((java.lang.Object) jsonPointer62);
        com.fasterxml.jackson.core.JsonPointer jsonPointer64 = new com.fasterxml.jackson.core.JsonPointer("i!", "hi!", jsonPointer62);
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
        org.junit.Assert.assertNotNull(jsonPointer56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(jsonPointer60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(jsonPointer62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        java.lang.String str22 = jsonPointer1._matchingPropertyName;
        boolean boolean23 = jsonPointer1.matches();
        int int24 = jsonPointer1.getMatchingIndex();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        int int11 = jsonPointer10.getMatchingIndex();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        java.lang.String str15 = jsonPointer14.toString();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        int int8 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2.tail();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        int int11 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        java.lang.String str22 = jsonPointer21.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        boolean boolean24 = jsonPointer9.equals((java.lang.Object) jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer();
        int int28 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27.matchProperty("hi!");
        int int31 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer27.matchProperty("hi!");
        boolean boolean34 = jsonPointer27.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer27._nextSegment;
        java.lang.String str36 = jsonPointer27._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = new com.fasterxml.jackson.core.JsonPointer();
        int int39 = jsonPointer38._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = jsonPointer38.matchProperty("hi!");
        boolean boolean42 = jsonPointer38.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer44 = jsonPointer38.matchProperty("hi!");
        java.lang.String str45 = jsonPointer38.getMatchingProperty();
        int int46 = jsonPointer38.getMatchingIndex();
        boolean boolean47 = jsonPointer37.equals((java.lang.Object) int46);
        boolean boolean48 = jsonPointer21.equals((java.lang.Object) jsonPointer37);
        java.lang.String str49 = jsonPointer37.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer51 = jsonPointer37.matchProperty("hi!");
        int int52 = jsonPointer37.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jsonPointer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(jsonPointer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(jsonPointer44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer20.tail();
        int int22 = jsonPointer21.getMatchingIndex();
        int int23 = jsonPointer21._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("", "~i!", jsonPointer4);
        org.junit.Assert.assertNotNull(jsonPointer4);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchElement((int) '#');
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer14.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.matchProperty("i!");
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
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2.matchElement((int) (byte) 10);
        int int12 = jsonPointer2._matchingElementIndex;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "~hi!", jsonPointer15);
        int int22 = jsonPointer21.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        boolean boolean28 = jsonPointer0.mayMatchElement();
        java.lang.String str29 = jsonPointer0._asString;
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("~i!");
        org.junit.Assert.assertNotNull(jsonPointer1);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean3 = jsonPointer0.equals((java.lang.Object) (short) 1);
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) ' ');
        java.lang.String str7 = jsonPointer0._asString;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("~i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid input: JSON Pointer expression must start with '/': \"~i!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        java.lang.String str8 = jsonPointer1.toString();
        java.lang.String str9 = jsonPointer1.toString();
        java.lang.String str10 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
        int int19 = jsonPointer14._matchingElementIndex;
        boolean boolean20 = jsonPointer14.mayMatchProperty();
        boolean boolean21 = jsonPointer14.mayMatchElement();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        int int13 = jsonPointer12._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12.tail();
        boolean boolean15 = jsonPointer12.mayMatchProperty();
        int int16 = jsonPointer12.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer12.tail();
        java.lang.String str18 = jsonPointer12.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean20 = jsonPointer19.matches();
        boolean boolean21 = jsonPointer12.equals((java.lang.Object) boolean20);
        int int22 = jsonPointer12.getMatchingIndex();
        boolean boolean23 = jsonPointer12.matches();
        boolean boolean24 = jsonPointer12.matches();
        boolean boolean25 = jsonPointer10.equals((java.lang.Object) jsonPointer12);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer3.tail();
        java.lang.String str12 = jsonPointer3.toString();
        java.lang.String str13 = jsonPointer3.getMatchingProperty();
        boolean boolean14 = jsonPointer3.mayMatchProperty();
        boolean boolean15 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer();
        int int21 = jsonPointer20._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.tail();
        boolean boolean23 = jsonPointer20.mayMatchProperty();
        boolean boolean24 = jsonPointer20.mayMatchElement();
        int int25 = jsonPointer20.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer20);
        boolean boolean27 = jsonPointer26.mayMatchProperty();
        boolean boolean28 = jsonPointer26.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer26);
        boolean boolean30 = jsonPointer3.equals((java.lang.Object) jsonPointer29);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        java.lang.Class<?> wildcardClass19 = jsonPointer0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean9 = jsonPointer5.equals((java.lang.Object) 1.0d);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean11 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10._nextSegment;
        java.lang.Class<?> wildcardClass13 = jsonPointer10.getClass();
        boolean boolean14 = jsonPointer5.equals((java.lang.Object) jsonPointer10);
        java.lang.String str15 = jsonPointer5._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        boolean boolean4 = jsonPointer0.matches();
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        boolean boolean16 = jsonPointer15.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3._nextSegment;
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.toString();
        java.lang.String str3 = jsonPointer0._asString;
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        int int13 = jsonPointer12._matchingElementIndex;
        boolean boolean14 = jsonPointer12.matches();
        boolean boolean15 = jsonPointer0.equals((java.lang.Object) boolean14);
        boolean boolean16 = jsonPointer0.mayMatchElement();
        boolean boolean17 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.lang.String str13 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer21);
        int int24 = jsonPointer23._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer23);
        java.lang.String str27 = jsonPointer23.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer23.tail();
        boolean boolean29 = jsonPointer2.equals((java.lang.Object) jsonPointer28);
        java.lang.String str30 = jsonPointer2.toString();
        java.lang.Class<?> wildcardClass31 = jsonPointer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer28.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer28.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer28);
        int int34 = jsonPointer33.getMatchingIndex();
        boolean boolean35 = jsonPointer33.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer33.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer36);
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer37._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer38);
        boolean boolean40 = jsonPointer13.equals((java.lang.Object) jsonPointer38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jsonPointer28);
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonPointer36);
        org.junit.Assert.assertNotNull(jsonPointer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        java.lang.String str10 = jsonPointer1._matchingPropertyName;
        int int11 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer1.matchElement(0);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str5 = jsonPointer3._asString;
        java.lang.String str6 = jsonPointer3._matchingPropertyName;
        boolean boolean7 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        java.lang.String str18 = jsonPointer17.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        java.lang.String str20 = jsonPointer17._matchingPropertyName;
        java.lang.Class<?> wildcardClass21 = jsonPointer17.getClass();
        boolean boolean22 = jsonPointer1.equals((java.lang.Object) jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        int int17 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.tail();
        boolean boolean19 = jsonPointer16.mayMatchProperty();
        int int20 = jsonPointer16.getMatchingIndex();
        boolean boolean21 = jsonPointer14.equals((java.lang.Object) jsonPointer16);
        java.lang.String str22 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23.matchProperty("hi!");
        java.lang.String str26 = jsonPointer23._asString;
        int int27 = jsonPointer23.getMatchingIndex();
        java.lang.String str28 = jsonPointer23.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer23._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer29._nextSegment;
        boolean boolean31 = jsonPointer11.equals((java.lang.Object) jsonPointer29);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer29.tail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jsonPointer32);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        boolean boolean22 = jsonPointer18.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer18.matchProperty("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonPointer24);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer30);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer30);
        int int33 = jsonPointer32._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer32._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer32);
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer32.tail();
        boolean boolean37 = jsonPointer32.mayMatchElement();
        int int38 = jsonPointer32._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer32);
        java.lang.String str40 = jsonPointer32.toString();
        java.lang.String str41 = jsonPointer32.getMatchingProperty();
        boolean boolean42 = jsonPointer0.equals((java.lang.Object) jsonPointer32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertNotNull(jsonPointer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        java.lang.String str9 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.matchElement((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        boolean boolean8 = jsonPointer7.matches();
        java.lang.String str9 = jsonPointer7.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14._nextSegment;
        int int17 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14.tail();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer18);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 1);
        int int5 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer6.matchElement(1);
        org.junit.Assert.assertNotNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean11 = jsonPointer7.equals((java.lang.Object) 1.0d);
        java.lang.String str12 = jsonPointer7._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        java.lang.String str14 = jsonPointer13.toString();
        java.lang.String str15 = jsonPointer13._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", (int) (short) 1);
        int int7 = jsonPointer6.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer6);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        java.lang.String str12 = jsonPointer10.getMatchingProperty();
        java.lang.String str13 = jsonPointer10._matchingPropertyName;
        java.lang.String str14 = jsonPointer10._asString;
        java.lang.Class<?> wildcardClass15 = jsonPointer10.getClass();
        boolean boolean16 = jsonPointer6.equals((java.lang.Object) wildcardClass15);
        int int17 = jsonPointer6.getMatchingIndex();
        java.lang.String str18 = jsonPointer6._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "~i!" + "'", str18, "~i!");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        int int5 = jsonPointer2.getMatchingIndex();
        java.lang.String str6 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2.matchProperty("~i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer23.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchElement(100);
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
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        int int7 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.tail();
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        int int10 = jsonPointer6.getMatchingIndex();
        boolean boolean11 = jsonPointer4.equals((java.lang.Object) jsonPointer6);
        boolean boolean12 = jsonPointer4.mayMatchProperty();
        boolean boolean13 = jsonPointer4.mayMatchElement();
        int int14 = jsonPointer4.getMatchingIndex();
        java.lang.String str15 = jsonPointer4._asString;
        boolean boolean16 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonPointer19);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        java.lang.String str15 = jsonPointer10.getMatchingProperty();
        int int16 = jsonPointer10.getMatchingIndex();
        int int17 = jsonPointer10._matchingElementIndex;
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9._asString;
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        java.lang.String str14 = jsonPointer9._asString;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = jsonPointer8.equals((java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = jsonPointer4._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        int int6 = jsonPointer5._matchingElementIndex;
        java.lang.String str7 = jsonPointer5.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str9 = jsonPointer8.toString();
        boolean boolean10 = jsonPointer8.matches();
        boolean boolean11 = jsonPointer8.mayMatchProperty();
        java.lang.String str12 = jsonPointer8.toString();
        java.lang.Class<?> wildcardClass13 = jsonPointer8.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        int int15 = jsonPointer10.getMatchingIndex();
        int int16 = jsonPointer10.getMatchingIndex();
        java.lang.String str17 = jsonPointer10._matchingPropertyName;
        java.lang.String str18 = jsonPointer10.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer10.tail();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer19);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        java.lang.String str6 = jsonPointer4.getMatchingProperty();
        boolean boolean7 = jsonPointer1.equals((java.lang.Object) jsonPointer4);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        boolean boolean23 = jsonPointer21.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21._nextSegment;
        boolean boolean25 = jsonPointer24.mayMatchProperty();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer();
        int int23 = jsonPointer22._matchingElementIndex;
        boolean boolean24 = jsonPointer22.matches();
        java.lang.String str25 = jsonPointer22.toString();
        boolean boolean26 = jsonPointer22.mayMatchProperty();
        boolean boolean27 = jsonPointer22.matches();
        boolean boolean28 = jsonPointer15.equals((java.lang.Object) jsonPointer22);
        java.lang.String str29 = jsonPointer15._asString;
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0._nextSegment;
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str9 = jsonPointer8._matchingPropertyName;
        java.lang.String str10 = jsonPointer8.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.tail();
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        int int13 = jsonPointer11._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        int int7 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer18.tail();
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
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        int int22 = jsonPointer8.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.toString();
        java.lang.String str3 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        boolean boolean16 = jsonPointer15.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer15.matchProperty("");
        java.lang.Class<?> wildcardClass19 = jsonPointer15.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("");
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.matchElement(10);
        int int12 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        java.lang.String str16 = jsonPointer15._asString;
        boolean boolean17 = jsonPointer3.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.matchProperty("");
        boolean boolean20 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("~hi!", "", jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean9 = jsonPointer5.equals((java.lang.Object) 1.0d);
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        int int11 = jsonPointer5._matchingElementIndex;
        int int12 = jsonPointer5.getMatchingIndex();
        boolean boolean13 = jsonPointer5.matches();
        int int14 = jsonPointer5.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 31, length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int26 = jsonPointer25.getMatchingIndex();
        java.lang.String str27 = jsonPointer25._matchingPropertyName;
        java.lang.String str28 = jsonPointer25.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer25.matchProperty("hi!");
        boolean boolean31 = jsonPointer25.mayMatchElement();
        boolean boolean32 = jsonPointer25.mayMatchElement();
        boolean boolean33 = jsonPointer12.equals((java.lang.Object) jsonPointer25);
        java.lang.String str34 = jsonPointer12._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        boolean boolean10 = jsonPointer0.matches();
        java.lang.String str11 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.tail();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.tail();
        boolean boolean6 = jsonPointer1.matches();
        boolean boolean7 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        boolean boolean2 = jsonPointer0.matches();
        boolean boolean3 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        int int11 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer19);
        java.lang.String str22 = jsonPointer21.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer21);
        boolean boolean24 = jsonPointer9.equals((java.lang.Object) jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer();
        int int28 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27.matchProperty("hi!");
        int int31 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer27.matchProperty("hi!");
        boolean boolean34 = jsonPointer27.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer27._nextSegment;
        java.lang.String str36 = jsonPointer27._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = new com.fasterxml.jackson.core.JsonPointer();
        int int39 = jsonPointer38._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = jsonPointer38.matchProperty("hi!");
        boolean boolean42 = jsonPointer38.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer44 = jsonPointer38.matchProperty("hi!");
        java.lang.String str45 = jsonPointer38.getMatchingProperty();
        int int46 = jsonPointer38.getMatchingIndex();
        boolean boolean47 = jsonPointer37.equals((java.lang.Object) int46);
        boolean boolean48 = jsonPointer21.equals((java.lang.Object) jsonPointer37);
        java.lang.String str49 = jsonPointer37.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer51 = jsonPointer37.matchProperty("hi!");
        java.lang.String str52 = jsonPointer51.toString();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(jsonPointer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(jsonPointer41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(jsonPointer44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement(0);
        java.lang.String str7 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        int int11 = jsonPointer10.getMatchingIndex();
        boolean boolean12 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        java.lang.String str15 = jsonPointer14._asString;
        boolean boolean16 = jsonPointer14.mayMatchProperty();
        java.lang.String str17 = jsonPointer14._asString;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        java.lang.String str13 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer2.matchProperty("~hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        boolean boolean21 = jsonPointer1.mayMatchElement();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        boolean boolean6 = jsonPointer2.mayMatchElement();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        java.lang.String str8 = jsonPointer2.toString();
        int int9 = jsonPointer2._matchingElementIndex;
        int int10 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("i!", "", jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = jsonPointer9._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.lang.String str17 = jsonPointer16._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer12.matchElement((int) ' ');
        java.lang.String str17 = jsonPointer12._matchingPropertyName;
        int int18 = jsonPointer12.getMatchingIndex();
        java.lang.Class<?> wildcardClass19 = jsonPointer12.getClass();
        boolean boolean20 = jsonPointer0.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        boolean boolean8 = jsonPointer5.matches();
        java.lang.String str9 = jsonPointer5.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer5.matchProperty("hi!");
        java.lang.String str12 = jsonPointer5._matchingPropertyName;
        boolean boolean13 = jsonPointer5.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        int int22 = jsonPointer18.getMatchingIndex();
        boolean boolean23 = jsonPointer16.equals((java.lang.Object) jsonPointer18);
        java.lang.String str24 = jsonPointer16._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        boolean boolean26 = jsonPointer5.equals((java.lang.Object) jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer25.matchElement(100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer28);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer29);
        java.lang.String str31 = jsonPointer30._asString;
        boolean boolean32 = jsonPointer30.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jsonPointer28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str4 = jsonPointer3._matchingPropertyName;
        boolean boolean5 = jsonPointer3.mayMatchElement();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.tail();
        boolean boolean8 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        java.lang.String str11 = jsonPointer4.toString();
        boolean boolean12 = jsonPointer4.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer4._nextSegment;
        java.lang.String str14 = jsonPointer4._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "~hi!", jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        int int4 = jsonPointer3._matchingElementIndex;
        int int5 = jsonPointer3.getMatchingIndex();
        boolean boolean6 = jsonPointer3.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.tail();
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        boolean boolean14 = jsonPointer10.mayMatchElement();
        int int15 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        boolean boolean17 = jsonPointer16.mayMatchProperty();
        boolean boolean18 = jsonPointer16.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer16.tail();
        java.lang.String str21 = jsonPointer20._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer20.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str31 = jsonPointer30._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer30._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer32);
        boolean boolean34 = jsonPointer33.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer33.matchProperty("");
        boolean boolean37 = jsonPointer26.equals((java.lang.Object) jsonPointer33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(jsonPointer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        java.lang.String str10 = jsonPointer2._matchingPropertyName;
        java.lang.String str11 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        boolean boolean13 = jsonPointer12.mayMatchElement();
        java.lang.String str14 = jsonPointer12._matchingPropertyName;
        java.lang.String str15 = jsonPointer12._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer12.matchElement((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        boolean boolean6 = jsonPointer2.mayMatchElement();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        java.lang.String str8 = jsonPointer2._asString;
        java.lang.String str9 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonPointer11.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
            int int13 = jsonPointer12._matchingElementIndex;
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
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean11 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        int int15 = jsonPointer5._matchingElementIndex;
        java.lang.String str16 = jsonPointer5._asString;
        int int17 = jsonPointer5._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer3.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 1);
        boolean boolean11 = jsonPointer8.matches();
        java.lang.String str12 = jsonPointer8.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer8.matchProperty("hi!");
        java.lang.String str15 = jsonPointer8._matchingPropertyName;
        boolean boolean16 = jsonPointer8.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean20 = jsonPointer19.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        int int25 = jsonPointer21.getMatchingIndex();
        boolean boolean26 = jsonPointer19.equals((java.lang.Object) jsonPointer21);
        java.lang.String str27 = jsonPointer19._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer19);
        boolean boolean29 = jsonPointer8.equals((java.lang.Object) jsonPointer28);
        boolean boolean30 = jsonPointer8.mayMatchElement();
        boolean boolean31 = jsonPointer3.equals((java.lang.Object) boolean30);
        java.lang.String str32 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("i!", "", jsonPointer11);
        int int14 = jsonPointer11.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.tail();
        boolean boolean14 = jsonPointer9.mayMatchElement();
        int int15 = jsonPointer9._matchingElementIndex;
        int int16 = jsonPointer9.getMatchingIndex();
        java.lang.String str17 = jsonPointer9._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        java.lang.String str18 = jsonPointer10._matchingPropertyName;
        java.lang.String str19 = jsonPointer10.toString();
        java.lang.String str20 = jsonPointer10._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int4 = jsonPointer3.getMatchingIndex();
        java.lang.String str5 = jsonPointer3._matchingPropertyName;
        java.lang.String str6 = jsonPointer3._matchingPropertyName;
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        int int8 = jsonPointer3._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str10 = jsonPointer9.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str8 = jsonPointer7._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean12 = jsonPointer9.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("~i!", "", jsonPointer9);
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer18);
        java.lang.String str21 = jsonPointer20.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer20);
        boolean boolean23 = jsonPointer20.matches();
        java.lang.String str24 = jsonPointer20._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer20.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer28.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer28.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer28.matchProperty("hi!");
        java.lang.String str35 = jsonPointer28.toString();
        java.lang.Class<?> wildcardClass36 = jsonPointer28.getClass();
        boolean boolean37 = jsonPointer20.equals((java.lang.Object) wildcardClass36);
        boolean boolean38 = jsonPointer0.equals((java.lang.Object) jsonPointer20);
        boolean boolean39 = jsonPointer20.matches();
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
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertNotNull(jsonPointer28);
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertNull(jsonPointer34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        java.lang.String str7 = jsonPointer0._asString;
        int int8 = jsonPointer0.getMatchingIndex();
        java.lang.String str9 = jsonPointer0._matchingPropertyName;
        int int10 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        java.lang.String str8 = jsonPointer1.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.Class<?> wildcardClass7 = jsonPointer5.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        boolean boolean24 = jsonPointer23.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer23.matchElement((int) (byte) 10);
        boolean boolean27 = jsonPointer23.mayMatchElement();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        java.lang.Class<?> wildcardClass20 = jsonPointer19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchProperty("hi!");
        java.lang.String str9 = jsonPointer3._asString;
        java.lang.String str10 = jsonPointer3._asString;
        java.lang.String str11 = jsonPointer3.toString();
        java.lang.String str12 = jsonPointer3.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str8 = jsonPointer7.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        int int10 = jsonPointer7.getMatchingIndex();
        java.lang.String str11 = jsonPointer7._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer25.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = jsonPointer26._asString;
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertNull(jsonPointer26);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.matches();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        java.lang.String str14 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer13.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.matchProperty("");
        boolean boolean19 = jsonPointer18.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer18);
        java.lang.String str21 = jsonPointer18._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str9 = jsonPointer8._matchingPropertyName;
        int int10 = jsonPointer8.getMatchingIndex();
        int int11 = jsonPointer8.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        java.lang.String str18 = jsonPointer10._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer10.matchElement((int) (byte) -1);
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        int int4 = jsonPointer1.getMatchingIndex();
        boolean boolean5 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean7 = jsonPointer6.mayMatchElement();
        java.lang.String str8 = jsonPointer6._asString;
        boolean boolean9 = jsonPointer6.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer6);
        boolean boolean11 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        int int13 = jsonPointer12._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.matchProperty("hi!");
        int int16 = jsonPointer12._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer12.tail();
        boolean boolean18 = jsonPointer10.equals((java.lang.Object) jsonPointer12);
        boolean boolean19 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer12);
        java.lang.String str21 = jsonPointer20.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("i!", "i!", jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean16 = jsonPointer15.mayMatchElement();
        java.lang.String str17 = jsonPointer15._asString;
        boolean boolean18 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        boolean boolean20 = jsonPointer19.matches();
        boolean boolean21 = jsonPointer2.equals((java.lang.Object) jsonPointer19);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("~i!", "i!", jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        int int10 = jsonPointer0._matchingElementIndex;
        int int11 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        int int18 = jsonPointer14.getMatchingIndex();
        boolean boolean19 = jsonPointer12.equals((java.lang.Object) jsonPointer14);
        java.lang.String str20 = jsonPointer12.getMatchingProperty();
        int int21 = jsonPointer12.getMatchingIndex();
        java.lang.String str22 = jsonPointer12._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer12.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer12.matchProperty("hi!");
        boolean boolean26 = jsonPointer0.equals((java.lang.Object) jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonPointer13._matchingElementIndex;
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
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer56 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer15);
        int int57 = jsonPointer15._matchingElementIndex;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchProperty("i!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean10 = jsonPointer9.mayMatchElement();
        boolean boolean11 = jsonPointer0.equals((java.lang.Object) jsonPointer9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        int int11 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9._nextSegment;
        java.lang.String str13 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str15 = jsonPointer14._matchingPropertyName;
        boolean boolean17 = jsonPointer14.equals((java.lang.Object) (short) 1);
        java.lang.String str18 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer14.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer();
        int int22 = jsonPointer21._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer21.tail();
        boolean boolean24 = jsonPointer21.mayMatchProperty();
        boolean boolean25 = jsonPointer21.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer21.matchProperty("hi!");
        java.lang.Class<?> wildcardClass28 = jsonPointer21.getClass();
        boolean boolean29 = jsonPointer14.equals((java.lang.Object) jsonPointer21);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer14._nextSegment;
        boolean boolean31 = jsonPointer9.equals((java.lang.Object) jsonPointer30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = jsonPointer30.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        int int18 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.tail();
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer31.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer31.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer34._nextSegment;
        int int36 = jsonPointer34._matchingElementIndex;
        boolean boolean37 = jsonPointer17.equals((java.lang.Object) jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertNull(jsonPointer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int6 = jsonPointer5.getMatchingIndex();
        java.lang.String str7 = jsonPointer5._matchingPropertyName;
        java.lang.String str8 = jsonPointer5._matchingPropertyName;
        java.lang.String str9 = jsonPointer5.getMatchingProperty();
        int int10 = jsonPointer5._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("~hi!", "i!", jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer21.matchProperty("hi!");
        java.lang.String str25 = jsonPointer21.toString();
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
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean16 = jsonPointer15.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer();
        int int18 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.tail();
        boolean boolean20 = jsonPointer17.mayMatchProperty();
        int int21 = jsonPointer17.getMatchingIndex();
        boolean boolean22 = jsonPointer15.equals((java.lang.Object) jsonPointer17);
        java.lang.String str23 = jsonPointer15.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer24.matchProperty("hi!");
        java.lang.String str27 = jsonPointer24._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer24.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer24._nextSegment;
        boolean boolean31 = jsonPointer9.equals((java.lang.Object) jsonPointer30);
        java.lang.String str32 = jsonPointer9._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        int int13 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        java.lang.String str15 = jsonPointer14.toString();
        java.lang.String str16 = jsonPointer14.getMatchingProperty();
        boolean boolean17 = jsonPointer14.matches();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        boolean boolean22 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer2.matchProperty("~hi!");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jsonPointer24);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        java.lang.String str52 = jsonPointer48._asString;
        int int53 = jsonPointer48._matchingElementIndex;
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer14.matchProperty("");
        int int19 = jsonPointer14._matchingElementIndex;
        java.lang.String str20 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str23 = jsonPointer22._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean26 = jsonPointer25.mayMatchElement();
        int int27 = jsonPointer25._matchingElementIndex;
        java.lang.Class<?> wildcardClass28 = jsonPointer25.getClass();
        boolean boolean29 = jsonPointer22.equals((java.lang.Object) jsonPointer25);
        boolean boolean30 = jsonPointer22.matches();
        boolean boolean31 = jsonPointer22.matches();
        java.lang.String str32 = jsonPointer22._matchingPropertyName;
        boolean boolean33 = jsonPointer14.equals((java.lang.Object) jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "i!" + "'", str32, "i!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.tail();
        boolean boolean6 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.matchProperty("~hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jsonPointer11.getClass();
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
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        java.lang.String str30 = jsonPointer7._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer7.tail();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(jsonPointer31);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer13.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        java.lang.String str23 = jsonPointer13.toString();
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
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        boolean boolean9 = jsonPointer8.mayMatchProperty();
        boolean boolean10 = jsonPointer8.matches();
        java.lang.String str11 = jsonPointer8.toString();
        boolean boolean12 = jsonPointer8.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer15);
        boolean boolean17 = jsonPointer15.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.matchElement((int) (byte) 10);
        boolean boolean20 = jsonPointer15.matches();
        java.lang.String str21 = jsonPointer15._asString;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jsonPointer6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        int int11 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.tail();
        boolean boolean13 = jsonPointer10.mayMatchProperty();
        boolean boolean14 = jsonPointer10.mayMatchElement();
        int int15 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer10);
        boolean boolean17 = jsonPointer16.mayMatchProperty();
        boolean boolean18 = jsonPointer16.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer16.tail();
        java.lang.String str21 = jsonPointer20._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer20.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer25);
        java.lang.String str27 = jsonPointer26.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        int int3 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchElement(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jsonPointer5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1.toString();
        boolean boolean6 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str4 = jsonPointer3.getMatchingProperty();
        boolean boolean5 = jsonPointer3.mayMatchProperty();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
        boolean boolean13 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer1._nextSegment;
        boolean boolean15 = jsonPointer1.mayMatchProperty();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        boolean boolean16 = jsonPointer8.matches();
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
        java.lang.String str31 = jsonPointer27.getMatchingProperty();
        boolean boolean32 = jsonPointer8.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer8.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("i!", "hi!", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer8.tail();
        java.lang.String str36 = jsonPointer8.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jsonPointer33);
        org.junit.Assert.assertNull(jsonPointer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        java.lang.String str5 = jsonPointer0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        java.lang.Class<?> wildcardClass22 = jsonPointer11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        java.lang.String str4 = jsonPointer2.getMatchingProperty();
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        java.lang.String str5 = jsonPointer1._asString;
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonPointer8.matches();
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
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = jsonPointer2._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNull(jsonPointer2);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        java.lang.String str10 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchProperty("hi!");
        boolean boolean15 = jsonPointer11.mayMatchElement();
        java.lang.String str16 = jsonPointer11._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer11.matchElement((int) (byte) 1);
        boolean boolean19 = jsonPointer1.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._asString;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.matches();
        boolean boolean9 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer14.matchElement(0);
        boolean boolean20 = jsonPointer14.mayMatchElement();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        boolean boolean4 = jsonPointer1.matches();
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchElement((int) (short) -1);
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        boolean boolean9 = jsonPointer1.mayMatchProperty();
        int int10 = jsonPointer1.getMatchingIndex();
        boolean boolean11 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~i!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 99, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        java.lang.String str15 = jsonPointer13._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer18._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.matchElement((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = jsonPointer21.matches();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchProperty("hi!");
        java.lang.String str6 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer3.matchProperty("~hi!");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        boolean boolean24 = jsonPointer18.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean26 = jsonPointer25.matches();
        java.lang.String str27 = jsonPointer25.getMatchingProperty();
        java.lang.Class<?> wildcardClass28 = jsonPointer25.getClass();
        boolean boolean29 = jsonPointer18.equals((java.lang.Object) jsonPointer25);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        java.lang.String str5 = jsonPointer0._asString;
        int int6 = jsonPointer0.getMatchingIndex();
        java.lang.String str7 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("");
        boolean boolean17 = jsonPointer16.mayMatchProperty();
        int int18 = jsonPointer16.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer16.matchProperty("~i!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        int int5 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~i!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 31, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        boolean boolean13 = jsonPointer7.equals((java.lang.Object) jsonPointer12);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.matchElement((int) ' ');
        int int16 = jsonPointer12._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer12.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer18);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
            com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer20._nextSegment;
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
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.matches();
        boolean boolean12 = jsonPointer7.matches();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        boolean boolean31 = jsonPointer26.mayMatchElement();
        boolean boolean32 = jsonPointer26.matches();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchElement((int) (short) -1);
        int int10 = jsonPointer3.getMatchingIndex();
        java.lang.String str11 = jsonPointer3.getMatchingProperty();
        java.lang.String str12 = jsonPointer3._matchingPropertyName;
        java.lang.String str13 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("~i!", "i!", jsonPointer3);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        java.lang.String str20 = jsonPointer14._asString;
        java.lang.String str21 = jsonPointer14.toString();
        java.lang.String str22 = jsonPointer14.getMatchingProperty();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer17.matchProperty("~i!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0.toString();
        java.lang.String str6 = jsonPointer0._asString;
        java.lang.String str7 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        int int23 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer17.tail();
        int int25 = jsonPointer17.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("i!", "i!", jsonPointer17);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((int) '4');
        java.lang.String str10 = jsonPointer1.toString();
        java.lang.String str11 = jsonPointer1._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 9, length 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        boolean boolean7 = jsonPointer6.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        int int18 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        java.lang.String str21 = jsonPointer17.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer17.matchProperty("hi!");
        boolean boolean24 = jsonPointer6.equals((java.lang.Object) jsonPointer17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        boolean boolean13 = jsonPointer12.mayMatchElement();
        java.lang.String str14 = jsonPointer12.getMatchingProperty();
        boolean boolean15 = jsonPointer12.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer12.tail();
        java.lang.String str17 = jsonPointer16._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer16);
        boolean boolean19 = jsonPointer0.equals((java.lang.Object) "hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer0.matchProperty("");
        java.lang.String str22 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        java.lang.String str11 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer11);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        java.lang.String str9 = jsonPointer3.toString();
        java.lang.String str10 = jsonPointer3._asString;
        java.lang.String str11 = jsonPointer3._asString;
        boolean boolean12 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        int int13 = jsonPointer12.getMatchingIndex();
        boolean boolean14 = jsonPointer12.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer17);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchElement((int) '4');
        java.lang.Class<?> wildcardClass21 = jsonPointer18.getClass();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        boolean boolean6 = jsonPointer2.mayMatchProperty();
        java.lang.String str7 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        int int11 = jsonPointer2.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        boolean boolean19 = jsonPointer10.mayMatchProperty();
        java.lang.String str20 = jsonPointer10.toString();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        java.lang.String str24 = jsonPointer18.getMatchingProperty();
        java.lang.String str25 = jsonPointer18.getMatchingProperty();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        java.lang.String str17 = jsonPointer14._asString;
        int int18 = jsonPointer14._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = jsonPointer7.mayMatchElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        int int9 = jsonPointer8.getMatchingIndex();
        boolean boolean10 = jsonPointer8.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer8.matchElement((int) (byte) 1);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        int int14 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.matchElement((int) (byte) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = jsonPointer16._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = jsonPointer20.getMatchingProperty();
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
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchProperty("hi!");
        java.lang.String str15 = jsonPointer11._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer17.tail();
        java.lang.String str19 = jsonPointer18._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        int int12 = jsonPointer9._matchingElementIndex;
        int int13 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("");
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16.matchProperty("hi!");
        boolean boolean20 = jsonPointer16.matches();
        java.lang.String str21 = jsonPointer16._matchingPropertyName;
        boolean boolean22 = jsonPointer0.equals((java.lang.Object) str21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~i!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start 1, end 34, length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        java.lang.String str10 = jsonPointer9.getMatchingProperty();
        int int11 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchProperty("hi!");
        boolean boolean14 = jsonPointer9.matches();
        int int15 = jsonPointer9._matchingElementIndex;
        java.lang.String str16 = jsonPointer9.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9.getMatchingProperty();
        boolean boolean12 = jsonPointer9.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "i!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.matchElement((-1));
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        java.lang.String str8 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchProperty("~hi!");
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("");
        java.lang.String str7 = jsonPointer0.toString();
        java.lang.String str8 = jsonPointer0._asString;
        java.lang.Class<?> wildcardClass9 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        java.lang.String str5 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.getMatchingProperty();
        java.lang.String str8 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        boolean boolean8 = jsonPointer5.matches();
        java.lang.String str9 = jsonPointer5.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer5.matchProperty("hi!");
        java.lang.String str12 = jsonPointer5._matchingPropertyName;
        boolean boolean13 = jsonPointer5.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean17 = jsonPointer16.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        boolean boolean21 = jsonPointer18.mayMatchProperty();
        int int22 = jsonPointer18.getMatchingIndex();
        boolean boolean23 = jsonPointer16.equals((java.lang.Object) jsonPointer18);
        java.lang.String str24 = jsonPointer16._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer16);
        boolean boolean26 = jsonPointer5.equals((java.lang.Object) jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer28);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer29._nextSegment;
        boolean boolean31 = jsonPointer29.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        java.lang.String str19 = jsonPointer4.getMatchingProperty();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str4 = jsonPointer3._matchingPropertyName;
        boolean boolean5 = jsonPointer3.mayMatchElement();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.tail();
        boolean boolean8 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (byte) -1);
        boolean boolean12 = jsonPointer9.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str4 = jsonPointer3._matchingPropertyName;
        boolean boolean5 = jsonPointer3.mayMatchElement();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        java.lang.String str7 = jsonPointer3._asString;
        java.lang.String str8 = jsonPointer3.toString();
        java.lang.String str9 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertNotNull(jsonPointer13);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = jsonPointer13._matchingElementIndex;
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(jsonPointer13);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer9.matchProperty("hi!");
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
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer4.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer4);
        java.lang.String str21 = jsonPointer4._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("i!", "i!", jsonPointer4);
        boolean boolean23 = jsonPointer22.mayMatchProperty();
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
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        int int13 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        java.lang.String str15 = jsonPointer14.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer2.matchProperty("hi!");
        boolean boolean18 = jsonPointer2.matches();
        java.lang.String str19 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer25.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer25.matchElement((int) ' ');
        java.lang.String str30 = jsonPointer25._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer25);
        boolean boolean32 = jsonPointer31.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer31);
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer31.tail();
        boolean boolean35 = jsonPointer2.equals((java.lang.Object) jsonPointer31);
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
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertNull(jsonPointer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        java.lang.String str22 = jsonPointer14._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        boolean boolean9 = jsonPointer8.mayMatchProperty();
        boolean boolean10 = jsonPointer8.mayMatchProperty();
        java.lang.String str11 = jsonPointer8._asString;
        java.lang.String str12 = jsonPointer8.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("i!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        java.lang.String str16 = jsonPointer15._asString;
        boolean boolean17 = jsonPointer3.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer15.tail();
        java.lang.String str19 = jsonPointer18.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("i!", "hi!", jsonPointer18);
        java.lang.Class<?> wildcardClass23 = jsonPointer22.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        java.lang.String str5 = jsonPointer2._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        int int9 = jsonPointer8.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        int int33 = jsonPointer32._matchingElementIndex;
        boolean boolean34 = jsonPointer32.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer32.matchProperty("~i!");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(jsonPointer36);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer4.mayMatchElement();
        boolean boolean11 = jsonPointer4.mayMatchElement();
        int int12 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("i!", "~hi!", jsonPointer4);
        java.lang.String str14 = jsonPointer13.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "~hi!" + "'", str14, "~hi!");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        java.lang.String str16 = jsonPointer11._asString;
        boolean boolean17 = jsonPointer11.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.getMatchingProperty();
        int int8 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer1.matchElement((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonPointer10.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.toString();
        java.lang.String str3 = jsonPointer0._asString;
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("~i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        int int15 = jsonPointer13.getMatchingIndex();
        java.lang.String str16 = jsonPointer13.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.tail();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer17);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean11 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("");
        int int17 = jsonPointer14._matchingElementIndex;
        java.lang.String str18 = jsonPointer14._asString;
        java.lang.Class<?> wildcardClass19 = jsonPointer14.getClass();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(jsonPointer2);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.matchProperty("");
        int int6 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        java.lang.String str17 = jsonPointer13._asString;
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean6 = jsonPointer0.equals((java.lang.Object) (byte) 10);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("i!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jsonPointer2);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) jsonPointer2);
        java.lang.String str8 = jsonPointer0.getMatchingProperty();
        boolean boolean9 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        java.lang.String str25 = jsonPointer2.getMatchingProperty();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
            int int18 = jsonPointer17.getMatchingIndex();
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
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9.matchElement((int) ' ');
        java.lang.String str14 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        int int16 = jsonPointer15._matchingElementIndex;
        boolean boolean17 = jsonPointer0.equals((java.lang.Object) jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer0._nextSegment;
        java.lang.String str19 = jsonPointer0._asString;
        int int20 = jsonPointer0.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0.tail();
        java.lang.String str5 = jsonPointer0.toString();
        java.lang.String str6 = jsonPointer0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        java.lang.String str7 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) jsonPointer4);
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        boolean boolean11 = jsonPointer2.mayMatchElement();
        int int12 = jsonPointer2.getMatchingIndex();
        java.lang.String str13 = jsonPointer2._asString;
        boolean boolean14 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.Class<?> wildcardClass16 = jsonPointer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchElement((int) (short) 100);
        java.lang.String str8 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        int int10 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int18 = jsonPointer17.getMatchingIndex();
        java.lang.String str19 = jsonPointer17.getMatchingProperty();
        int int20 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer24);
        boolean boolean26 = jsonPointer25.mayMatchElement();
        java.lang.String str27 = jsonPointer25._matchingPropertyName;
        java.lang.String str28 = jsonPointer25.toString();
        boolean boolean29 = jsonPointer17.equals((java.lang.Object) jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer25.tail();
        boolean boolean31 = jsonPointer13.equals((java.lang.Object) jsonPointer25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        java.lang.String str10 = jsonPointer0._asString;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        boolean boolean6 = jsonPointer0.mayMatchElement();
        boolean boolean7 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        java.lang.String str19 = jsonPointer11.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer10._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer10.tail();
        java.lang.String str24 = jsonPointer10.getMatchingProperty();
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
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        java.lang.String str20 = jsonPointer14._asString;
        java.lang.String str21 = jsonPointer14.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer23.matchElement((int) ' ');
        java.lang.String str28 = jsonPointer23._matchingPropertyName;
        int int29 = jsonPointer23.getMatchingIndex();
        java.lang.String str30 = jsonPointer23._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer23._nextSegment;
        boolean boolean32 = jsonPointer14.equals((java.lang.Object) jsonPointer23);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(jsonPointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer69 = jsonPointer63._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer70 = jsonPointer69.tail();
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
        org.junit.Assert.assertNotNull(jsonPointer69);
        org.junit.Assert.assertNull(jsonPointer70);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        int int15 = jsonPointer0._matchingElementIndex;
        java.lang.String str16 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20._nextSegment;
        boolean boolean23 = jsonPointer0.equals((java.lang.Object) jsonPointer20);
        java.lang.String str24 = jsonPointer20.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9._matchingPropertyName;
        java.lang.String str12 = jsonPointer9._asString;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        int int39 = jsonPointer22._matchingElementIndex;
        java.lang.String str40 = jsonPointer22.toString();
        java.lang.Class<?> wildcardClass41 = jsonPointer22.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str10 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        int int12 = jsonPointer11.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer2._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        boolean boolean8 = jsonPointer1.mayMatchProperty();
        boolean boolean9 = jsonPointer1.matches();
        java.lang.String str10 = jsonPointer1._asString;
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
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchElement(0);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str4 = jsonPointer3._asString;
        boolean boolean5 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        java.lang.String str7 = jsonPointer3._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "i!" + "'", str7, "i!");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        java.lang.String str14 = jsonPointer6._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer6._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str17 = jsonPointer16._matchingPropertyName;
        boolean boolean18 = jsonPointer16.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16._nextSegment;
        java.lang.String str20 = jsonPointer16.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer16._nextSegment;
        boolean boolean22 = jsonPointer16.matches();
        boolean boolean23 = jsonPointer6.equals((java.lang.Object) jsonPointer16);
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer();
        int int29 = jsonPointer28._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer28.tail();
        boolean boolean31 = jsonPointer28.mayMatchProperty();
        boolean boolean32 = jsonPointer28.mayMatchElement();
        int int33 = jsonPointer28.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer28);
        boolean boolean35 = jsonPointer34.mayMatchProperty();
        boolean boolean36 = jsonPointer34.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer34);
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer37._nextSegment;
        java.lang.String str39 = jsonPointer37._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = jsonPointer37._nextSegment;
        boolean boolean41 = jsonPointer6.equals((java.lang.Object) jsonPointer40);
        int int42 = jsonPointer40.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonPointer38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(jsonPointer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1.matchProperty("hi!");
        int int8 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int11 = jsonPointer10.getMatchingIndex();
        java.lang.String str12 = jsonPointer10._matchingPropertyName;
        java.lang.String str13 = jsonPointer10.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer10.matchProperty("hi!");
        boolean boolean16 = jsonPointer10.mayMatchElement();
        boolean boolean17 = jsonPointer1.equals((java.lang.Object) jsonPointer10);
        int int18 = jsonPointer10._matchingElementIndex;
        int int19 = jsonPointer10.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer10.tail();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        java.lang.String str9 = jsonPointer2.toString();
        boolean boolean10 = jsonPointer2.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer2._nextSegment;
        java.lang.String str12 = jsonPointer2._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer20);
        boolean boolean23 = jsonPointer22.mayMatchElement();
        java.lang.String str24 = jsonPointer22.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer22.tail();
        java.lang.String str26 = jsonPointer25.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer25);
        int int28 = jsonPointer27._matchingElementIndex;
        boolean boolean29 = jsonPointer2.equals((java.lang.Object) jsonPointer27);
        java.lang.String str30 = jsonPointer2.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str6 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer7._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer7);
        java.lang.String str11 = jsonPointer7.getMatchingProperty();
        java.lang.String str12 = jsonPointer7.getMatchingProperty();
        boolean boolean13 = jsonPointer7.matches();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1.getMatchingProperty();
        int int4 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        boolean boolean10 = jsonPointer9.mayMatchElement();
        java.lang.String str11 = jsonPointer9._matchingPropertyName;
        java.lang.String str12 = jsonPointer9.toString();
        boolean boolean13 = jsonPointer1.equals((java.lang.Object) jsonPointer9);
        java.lang.String str14 = jsonPointer9.toString();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        java.lang.String str15 = jsonPointer4.toString();
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        boolean boolean8 = jsonPointer4.mayMatchElement();
        int int9 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        java.lang.String str11 = jsonPointer4.toString();
        java.lang.String str12 = jsonPointer4.toString();
        java.lang.String str13 = jsonPointer4.getMatchingProperty();
        int int14 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("~i!", "~hi!", jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer21.tail();
        int int26 = jsonPointer25._matchingElementIndex;
        java.lang.String str27 = jsonPointer25.getMatchingProperty();
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
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        boolean boolean4 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.matchProperty("");
        boolean boolean7 = jsonPointer1.mayMatchElement();
        boolean boolean8 = jsonPointer1.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        int int10 = jsonPointer7.getMatchingIndex();
        java.lang.String str11 = jsonPointer7.getMatchingProperty();
        java.lang.Object obj12 = null;
        boolean boolean13 = jsonPointer7.equals(obj12);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        int int4 = jsonPointer1.getMatchingIndex();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1.toString();
        boolean boolean7 = jsonPointer1.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2.tail();
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        int int6 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer2.tail();
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        java.lang.String str10 = jsonPointer9._matchingPropertyName;
        java.lang.Class<?> wildcardClass11 = jsonPointer9.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0.toString();
        java.lang.String str4 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer5._nextSegment;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(jsonPointer5);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        java.lang.String str18 = jsonPointer2.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        boolean boolean6 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean10 = jsonPointer9.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        int int15 = jsonPointer11.getMatchingIndex();
        boolean boolean16 = jsonPointer9.equals((java.lang.Object) jsonPointer11);
        boolean boolean17 = jsonPointer11.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        boolean boolean19 = jsonPointer2.equals((java.lang.Object) jsonPointer11);
        boolean boolean20 = jsonPointer11.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str26 = jsonPointer25._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer25._nextSegment;
        int int28 = jsonPointer27._matchingElementIndex;
        int int29 = jsonPointer27.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer27.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer27);
        boolean boolean32 = jsonPointer11.equals((java.lang.Object) jsonPointer31);
        boolean boolean33 = jsonPointer11.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(jsonPointer30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        boolean boolean5 = jsonPointer4.mayMatchElement();
        java.lang.String str6 = jsonPointer4._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        java.lang.String str23 = jsonPointer18.getMatchingProperty();
        java.lang.String str24 = jsonPointer18._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer18.matchProperty("hi!");
        int int27 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("~hi!", "~i!", jsonPointer18);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str3 = jsonPointer2._matchingPropertyName;
        boolean boolean4 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2._nextSegment;
        java.lang.String str6 = jsonPointer2.toString();
        int int7 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        java.lang.String str9 = jsonPointer8._matchingPropertyName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0._nextSegment;
        int int3 = jsonPointer0._matchingElementIndex;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        boolean boolean5 = jsonPointer0.matches();
        boolean boolean6 = jsonPointer0.mayMatchElement();
        java.lang.String str7 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = jsonPointer8.mayMatchProperty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        int int13 = jsonPointer12.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12.tail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer30);
        boolean boolean32 = jsonPointer1.equals((java.lang.Object) "hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer1.matchElement((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int35 = jsonPointer34._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jsonPointer34);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        java.lang.String str7 = jsonPointer1.toString();
        boolean boolean8 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        boolean boolean30 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer1.matchProperty("i!");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(jsonPointer32);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        java.lang.String str10 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        int int12 = jsonPointer3.getMatchingIndex();
        int int13 = jsonPointer3.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        java.lang.String str17 = jsonPointer14._matchingPropertyName;
        boolean boolean18 = jsonPointer14.mayMatchProperty();
        boolean boolean19 = jsonPointer14.matches();
        boolean boolean20 = jsonPointer3.equals((java.lang.Object) jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        int int14 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.tail();
        boolean boolean18 = jsonPointer13.mayMatchElement();
        int int19 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer13);
        java.lang.String str21 = jsonPointer20.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer22.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(jsonPointer24);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer3._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer4);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchElement(1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = jsonPointer17.getMatchingIndex();
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
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        boolean boolean28 = jsonPointer26.matches();
        int int29 = jsonPointer26.getMatchingIndex();
        int int30 = jsonPointer26.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer26.matchElement((-1));
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(jsonPointer32);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0.toString();
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0._asString;
        java.lang.String str7 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        boolean boolean18 = jsonPointer13.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer13.matchElement((int) (byte) 10);
        boolean boolean21 = jsonPointer13.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str6 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        java.lang.String str10 = jsonPointer8.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer17);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int4 = jsonPointer3._matchingElementIndex;
        java.lang.String str5 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        boolean boolean7 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchElement((int) (short) 1);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonPointer9);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        int int3 = jsonPointer0.getMatchingIndex();
        java.lang.String str4 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        java.lang.String str7 = jsonPointer3.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        int int9 = jsonPointer8._matchingElementIndex;
        boolean boolean10 = jsonPointer8.matches();
        java.lang.String str11 = jsonPointer8.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }
}

