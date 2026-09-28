package com.fasterxml.jackson.core;

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
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        java.lang.String str14 = jsonPointer13.getMatchingProperty();
        int int15 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer16);
        java.lang.String str18 = jsonPointer16._asString;
        boolean boolean19 = jsonPointer16.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer0._nextSegment;
        boolean boolean10 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        boolean boolean13 = jsonPointer11.matches();
        java.lang.String str14 = jsonPointer11.toString();
        boolean boolean15 = jsonPointer11.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean19 = jsonPointer18.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer();
        int int21 = jsonPointer20._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.tail();
        boolean boolean23 = jsonPointer20.mayMatchProperty();
        int int24 = jsonPointer20.getMatchingIndex();
        boolean boolean25 = jsonPointer18.equals((java.lang.Object) jsonPointer20);
        boolean boolean26 = jsonPointer20.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer20);
        boolean boolean28 = jsonPointer11.equals((java.lang.Object) jsonPointer20);
        boolean boolean29 = jsonPointer20.mayMatchElement();
        java.lang.String str30 = jsonPointer20.getMatchingProperty();
        boolean boolean31 = jsonPointer0.equals((java.lang.Object) jsonPointer20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean11 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.matchProperty("");
        boolean boolean17 = jsonPointer16.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16.matchProperty("hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        int int14 = jsonPointer13.getMatchingIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        java.lang.String str6 = jsonPointer2._matchingPropertyName;
        java.lang.String str7 = jsonPointer2.getMatchingProperty();
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        int int9 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        int int15 = jsonPointer11.getMatchingIndex();
        boolean boolean16 = jsonPointer11.mayMatchProperty();
        java.lang.String str17 = jsonPointer11.toString();
        boolean boolean18 = jsonPointer11.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer11._nextSegment;
        boolean boolean20 = jsonPointer11.mayMatchElement();
        boolean boolean21 = jsonPointer2.equals((java.lang.Object) jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer11.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = jsonPointer22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(jsonPointer22);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer18.matchElement(100);
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        java.lang.String str33 = jsonPointer9._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer44 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer45 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer44);
        com.fasterxml.jackson.core.JsonPointer jsonPointer46 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer44);
        java.lang.String str47 = jsonPointer46.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer48 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer46);
        com.fasterxml.jackson.core.JsonPointer jsonPointer49 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer48);
        java.lang.String str50 = jsonPointer49.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer51 = jsonPointer49._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer52 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer49);
        boolean boolean53 = jsonPointer1.equals((java.lang.Object) jsonPointer49);
        java.lang.Class<?> wildcardClass54 = jsonPointer1.getClass();
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
        org.junit.Assert.assertNotNull(jsonPointer44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        int int33 = jsonPointer27._matchingElementIndex;
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
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0.tail();
        java.lang.String str5 = jsonPointer0.toString();
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        java.lang.String str7 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonPointer6._asString;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer6);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer17._nextSegment;
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
        org.junit.Assert.assertNotNull(jsonPointer20);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str2 = jsonPointer1._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1._nextSegment;
        boolean boolean5 = jsonPointer3.equals((java.lang.Object) 1L);
        java.lang.String str6 = jsonPointer3._asString;
        boolean boolean7 = jsonPointer3.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean5 = jsonPointer4.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4._nextSegment;
        int int7 = jsonPointer4._matchingElementIndex;
        int int8 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.matchProperty("");
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        java.lang.String str13 = jsonPointer11.toString();
        java.lang.String str14 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("~i!", "~hi!", jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean20 = jsonPointer19.mayMatchElement();
        int int21 = jsonPointer19._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer19._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer19._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer19.tail();
        int int25 = jsonPointer19._matchingElementIndex;
        int int26 = jsonPointer19._matchingElementIndex;
        boolean boolean27 = jsonPointer8.equals((java.lang.Object) int26);
        boolean boolean28 = jsonPointer8.matches();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        java.lang.String str18 = jsonPointer17._asString;
        java.lang.String str19 = jsonPointer17._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        int int8 = jsonPointer7._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7._nextSegment;
        boolean boolean10 = jsonPointer9.mayMatchProperty();
        int int11 = jsonPointer9.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean15 = jsonPointer14.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer();
        int int17 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16.tail();
        boolean boolean19 = jsonPointer16.mayMatchProperty();
        int int20 = jsonPointer16.getMatchingIndex();
        boolean boolean21 = jsonPointer14.equals((java.lang.Object) jsonPointer16);
        boolean boolean22 = jsonPointer14.mayMatchProperty();
        boolean boolean23 = jsonPointer14.mayMatchElement();
        int int24 = jsonPointer14.getMatchingIndex();
        java.lang.String str25 = jsonPointer14._asString;
        boolean boolean26 = jsonPointer14.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean28 = jsonPointer9.equals((java.lang.Object) jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer14.matchProperty("~i!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(jsonPointer30);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        java.lang.String str18 = jsonPointer17._asString;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer3);
        java.lang.String str9 = jsonPointer8._matchingPropertyName;
        int int10 = jsonPointer8._matchingElementIndex;
        java.lang.String str11 = jsonPointer8._asString;
        int int12 = jsonPointer8._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        java.lang.String str22 = jsonPointer1._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer1.tail();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        int int11 = jsonPointer10.getMatchingIndex();
        boolean boolean12 = jsonPointer10.matches();
        int int13 = jsonPointer10._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer9.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str14 = jsonPointer9.toString();
        java.lang.Class<?> wildcardClass15 = jsonPointer9.getClass();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        java.lang.String str14 = jsonPointer4._asString;
        boolean boolean15 = jsonPointer4.matches();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        int int13 = jsonPointer11.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        boolean boolean15 = jsonPointer11.mayMatchElement();
        int int16 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer11.tail();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = jsonPointer17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer0._nextSegment;
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
        org.junit.Assert.assertNull(jsonPointer14);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        java.lang.String str18 = jsonPointer8.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer8.matchProperty("~i!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer20);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer1.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.matchElement((int) ' ');
        java.lang.String str6 = jsonPointer1._matchingPropertyName;
        int int7 = jsonPointer1.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1.matchElement((-1));
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str11 = jsonPointer10._matchingPropertyName;
        boolean boolean12 = jsonPointer10.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.matchElement((int) 'a');
        boolean boolean15 = jsonPointer1.equals((java.lang.Object) jsonPointer10);
        boolean boolean16 = jsonPointer10.matches();
        java.lang.String str17 = jsonPointer10._asString;
        java.lang.String str18 = jsonPointer10._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer10.tail();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer19._nextSegment;
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        java.lang.String str12 = jsonPointer11.getMatchingProperty();
        java.lang.String str13 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str20 = jsonPointer19._matchingPropertyName;
        boolean boolean21 = jsonPointer19.mayMatchElement();
        boolean boolean22 = jsonPointer19.mayMatchProperty();
        java.lang.String str23 = jsonPointer19._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean25 = jsonPointer24.mayMatchElement();
        int int26 = jsonPointer24._matchingElementIndex;
        boolean boolean27 = jsonPointer19.equals((java.lang.Object) int26);
        boolean boolean28 = jsonPointer11.equals((java.lang.Object) boolean27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = jsonPointer11.matchProperty("~hi!");
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer16);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jsonPointer30);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        java.lang.String str5 = jsonPointer3._asString;
        java.lang.String str6 = jsonPointer3._matchingPropertyName;
        int int7 = jsonPointer3._matchingElementIndex;
        java.lang.String str8 = jsonPointer3.getMatchingProperty();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        int int4 = jsonPointer0.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer0.matchProperty("");
        boolean boolean8 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = null;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        boolean boolean13 = jsonPointer12.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.matchElement((int) (short) 1);
        boolean boolean18 = jsonPointer15.matches();
        java.lang.String str19 = jsonPointer15.getMatchingProperty();
        boolean boolean20 = jsonPointer15.mayMatchElement();
        boolean boolean21 = jsonPointer12.equals((java.lang.Object) jsonPointer15);
        boolean boolean22 = jsonPointer15.matches();
        int int23 = jsonPointer15._matchingElementIndex;
        boolean boolean24 = jsonPointer0.equals((java.lang.Object) jsonPointer15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer3.matchProperty("hi!");
        java.lang.String str10 = jsonPointer3.toString();
        java.lang.String str11 = jsonPointer3._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer3);
        int int13 = jsonPointer12.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer12._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean16 = jsonPointer15.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer();
        int int18 = jsonPointer17._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.tail();
        boolean boolean20 = jsonPointer17.mayMatchProperty();
        int int21 = jsonPointer17.getMatchingIndex();
        boolean boolean22 = jsonPointer15.equals((java.lang.Object) jsonPointer17);
        boolean boolean23 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer27);
        boolean boolean29 = jsonPointer15.equals((java.lang.Object) jsonPointer28);
        int int30 = jsonPointer28.getMatchingIndex();
        boolean boolean31 = jsonPointer28.matches();
        boolean boolean32 = jsonPointer12.equals((java.lang.Object) jsonPointer28);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer12.tail();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonPointer33);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        int int5 = jsonPointer4.getMatchingIndex();
        boolean boolean6 = jsonPointer4.matches();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.matchElement((int) (short) -1);
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.tail();
        java.lang.String str7 = jsonPointer0._asString;
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer13.matchElement((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = jsonPointer19._matchingPropertyName;
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
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer11);
        int int14 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer13);
        boolean boolean20 = jsonPointer13.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.Class<?> wildcardClass22 = jsonPointer13.getClass();
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("~hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(jsonPointer2);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer16.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer16.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        int int16 = jsonPointer9._matchingElementIndex;
        int int17 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer9._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer18);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        boolean boolean22 = jsonPointer13.matches();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        java.lang.String str16 = jsonPointer10.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10.tail();
        boolean boolean18 = jsonPointer10.mayMatchElement();
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
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer9._nextSegment;
        java.lang.String str14 = jsonPointer9._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        int int14 = jsonPointer6._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer6.tail();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        java.lang.String str53 = jsonPointer48._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer54 = jsonPointer48._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer56 = jsonPointer54.matchElement((int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(jsonPointer54);
        org.junit.Assert.assertNull(jsonPointer56);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        java.lang.String str10 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer3);
        boolean boolean12 = jsonPointer11.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer13.mayMatchElement();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str18 = jsonPointer17._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean21 = jsonPointer20.mayMatchElement();
        int int22 = jsonPointer20._matchingElementIndex;
        java.lang.Class<?> wildcardClass23 = jsonPointer20.getClass();
        boolean boolean24 = jsonPointer17.equals((java.lang.Object) jsonPointer20);
        boolean boolean25 = jsonPointer0.equals((java.lang.Object) boolean24);
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer0._nextSegment;
        boolean boolean27 = jsonPointer0.mayMatchElement();
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
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        java.lang.String str4 = jsonPointer2.getMatchingProperty();
        int int5 = jsonPointer2.getMatchingIndex();
        int int6 = jsonPointer2._matchingElementIndex;
        java.lang.String str7 = jsonPointer2.toString();
        boolean boolean8 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer2._nextSegment;
        boolean boolean10 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        int int12 = jsonPointer11._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.String str5 = jsonPointer0._asString;
        boolean boolean6 = jsonPointer0.mayMatchElement();
        java.lang.String str7 = jsonPointer0._asString;
        boolean boolean8 = jsonPointer0.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        boolean boolean3 = jsonPointer0.mayMatchProperty();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        int int5 = jsonPointer0.getMatchingIndex();
        java.lang.String str6 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        boolean boolean12 = jsonPointer9.matches();
        java.lang.String str13 = jsonPointer9._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer9.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer17.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer17.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer17.matchProperty("hi!");
        java.lang.String str24 = jsonPointer17.toString();
        java.lang.Class<?> wildcardClass25 = jsonPointer17.getClass();
        boolean boolean26 = jsonPointer9.equals((java.lang.Object) wildcardClass25);
        java.lang.String str27 = jsonPointer9._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer9.matchProperty("");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(jsonPointer29);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        java.lang.String str20 = jsonPointer18._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer21);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer27);
        java.lang.String str30 = jsonPointer29.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer29);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer31);
        java.lang.String str33 = jsonPointer32.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = jsonPointer32._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer32);
        boolean boolean36 = jsonPointer35.mayMatchElement();
        boolean boolean37 = jsonPointer35.mayMatchElement();
        boolean boolean38 = jsonPointer15.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer15.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer15.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer22._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer22);
        java.lang.Class<?> wildcardClass25 = jsonPointer24.getClass();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNotNull(jsonPointer21);
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertNull(jsonPointer23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        java.lang.String str10 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        int int12 = jsonPointer3._matchingElementIndex;
        boolean boolean13 = jsonPointer3.matches();
        java.lang.String str14 = jsonPointer3.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        boolean boolean10 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer7.tail();
        java.lang.String str12 = jsonPointer7._matchingPropertyName;
        boolean boolean13 = jsonPointer7.mayMatchProperty();
        boolean boolean14 = jsonPointer7.matches();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        java.lang.String str18 = jsonPointer17.toString();
        int int19 = jsonPointer17.getMatchingIndex();
        boolean boolean20 = jsonPointer17.mayMatchProperty();
        java.lang.String str21 = jsonPointer17.getMatchingProperty();
        java.lang.String str22 = jsonPointer17._asString;
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str34 = jsonPointer33._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer33._nextSegment;
        boolean boolean37 = jsonPointer35.equals((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass38 = jsonPointer35.getClass();
        boolean boolean39 = jsonPointer29.equals((java.lang.Object) jsonPointer35);
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
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        boolean boolean4 = jsonPointer0.mayMatchElement();
        java.lang.Class<?> wildcardClass5 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        java.lang.String str19 = jsonPointer8._asString;
        java.lang.String str20 = jsonPointer8.toString();
        java.lang.String str21 = jsonPointer8._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        int int5 = jsonPointer4._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer4.tail();
        boolean boolean7 = jsonPointer4.mayMatchProperty();
        int int8 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer4.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer4.matchProperty("");
        boolean boolean12 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer18);
        boolean boolean21 = jsonPointer20.mayMatchElement();
        java.lang.String str22 = jsonPointer20.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer20.tail();
        boolean boolean24 = jsonPointer4.equals((java.lang.Object) jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer25.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = new com.fasterxml.jackson.core.JsonPointer("", "~hi!", jsonPointer25);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(jsonPointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jsonPointer27);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        boolean boolean12 = jsonPointer2.matches();
        int int13 = jsonPointer2._matchingElementIndex;
        boolean boolean14 = jsonPointer2.mayMatchElement();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        java.lang.String str14 = jsonPointer4._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        boolean boolean21 = jsonPointer13.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer13.tail();
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
        org.junit.Assert.assertNotNull(jsonPointer22);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer30);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer30);
        java.lang.String str33 = jsonPointer32.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer32);
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = jsonPointer34.tail();
        java.lang.String str36 = jsonPointer34._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = jsonPointer34.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer34);
        boolean boolean40 = jsonPointer20.equals((java.lang.Object) jsonPointer39);
        java.lang.Class<?> wildcardClass41 = jsonPointer39.getClass();
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertNotNull(jsonPointer30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(jsonPointer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(jsonPointer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        boolean boolean14 = jsonPointer2.mayMatchElement();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        boolean boolean14 = jsonPointer13.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13._nextSegment;
        boolean boolean16 = jsonPointer15.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer15.tail();
        boolean boolean18 = jsonPointer15.mayMatchElement();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        boolean boolean21 = jsonPointer20.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonPointer22);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str25 = jsonPointer24._matchingPropertyName;
        boolean boolean26 = jsonPointer24.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer24._nextSegment;
        java.lang.String str28 = jsonPointer24.toString();
        boolean boolean29 = jsonPointer24.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer24);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer30.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer30._nextSegment;
        boolean boolean34 = jsonPointer2.equals((java.lang.Object) jsonPointer33);
        java.lang.Class<?> wildcardClass35 = jsonPointer2.getClass();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.tail();
        java.lang.String str4 = jsonPointer0._matchingPropertyName;
        boolean boolean5 = jsonPointer0.mayMatchProperty();
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        int int13 = jsonPointer12._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer12.matchProperty("");
        boolean boolean16 = jsonPointer12.mayMatchElement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        int int19 = jsonPointer12.getMatchingIndex();
        java.lang.String str20 = jsonPointer12.getMatchingProperty();
        boolean boolean21 = jsonPointer12.matches();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer3.matchElement((int) ' ');
        java.lang.String str8 = jsonPointer3._matchingPropertyName;
        int int9 = jsonPointer3.getMatchingIndex();
        java.lang.String str10 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        int int12 = jsonPointer3._matchingElementIndex;
        boolean boolean13 = jsonPointer3.matches();
        int int14 = jsonPointer3._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        boolean boolean16 = jsonPointer14.mayMatchProperty();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        java.lang.String str18 = jsonPointer14.toString();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean5 = jsonPointer0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = jsonPointer0.equals((java.lang.Object) 10.0f);
        boolean boolean8 = jsonPointer0.mayMatchElement();
        boolean boolean9 = jsonPointer0.mayMatchElement();
        boolean boolean10 = jsonPointer0.mayMatchProperty();
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
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        java.lang.Class<?> wildcardClass19 = jsonPointer16.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        java.lang.String str6 = jsonPointer2._matchingPropertyName;
        java.lang.String str7 = jsonPointer2.getMatchingProperty();
        java.lang.String str8 = jsonPointer2.getMatchingProperty();
        int int9 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer();
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        boolean boolean14 = jsonPointer11.mayMatchProperty();
        int int15 = jsonPointer11.getMatchingIndex();
        boolean boolean16 = jsonPointer11.mayMatchProperty();
        java.lang.String str17 = jsonPointer11.toString();
        boolean boolean18 = jsonPointer11.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer11._nextSegment;
        boolean boolean20 = jsonPointer11.mayMatchElement();
        boolean boolean21 = jsonPointer2.equals((java.lang.Object) jsonPointer11);
        boolean boolean22 = jsonPointer2.mayMatchProperty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        boolean boolean18 = jsonPointer2.mayMatchElement();
        boolean boolean19 = jsonPointer2.matches();
        java.lang.String str20 = jsonPointer2.toString();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        boolean boolean4 = jsonPointer2.matches();
        java.lang.String str5 = jsonPointer2.toString();
        boolean boolean7 = jsonPointer2.equals((java.lang.Object) (-1.0d));
        boolean boolean9 = jsonPointer2.equals((java.lang.Object) 10.0f);
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer2.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer10);
        java.lang.String str12 = jsonPointer11._asString;
        java.lang.String str13 = jsonPointer11._matchingPropertyName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        java.lang.String str8 = jsonPointer7.toString();
        java.lang.String str9 = jsonPointer7._matchingPropertyName;
        java.lang.String str10 = jsonPointer7._matchingPropertyName;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        int int12 = jsonPointer11._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        java.lang.String str15 = jsonPointer11.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer11.tail();
        boolean boolean18 = jsonPointer11.matches();
        java.lang.String str19 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer11.matchElement((int) ' ');
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        java.lang.String str21 = jsonPointer20._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = jsonPointer20.matchElement((int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(jsonPointer23);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        java.lang.String str4 = jsonPointer2._asString;
        boolean boolean5 = jsonPointer2.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer2);
        java.lang.String str7 = jsonPointer6._asString;
        boolean boolean8 = jsonPointer6.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer6._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer6._nextSegment;
        java.lang.String str11 = jsonPointer10.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        java.lang.String str15 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer0.tail();
        java.lang.String str17 = jsonPointer0._matchingPropertyName;
        boolean boolean18 = jsonPointer0.matches();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        java.lang.String str16 = jsonPointer11.getMatchingProperty();
        java.lang.String str17 = jsonPointer11._asString;
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0.tail();
        java.lang.String str5 = jsonPointer0.toString();
        java.lang.String str6 = jsonPointer0._asString;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int2 = jsonPointer1._matchingElementIndex;
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        int int4 = jsonPointer1.getMatchingIndex();
        boolean boolean5 = jsonPointer1.mayMatchProperty();
        java.lang.String str6 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        boolean boolean18 = jsonPointer14.equals((java.lang.Object) 1.0d);
        java.lang.String str19 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer20.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean26 = jsonPointer25.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer();
        int int28 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer27.tail();
        boolean boolean30 = jsonPointer27.mayMatchProperty();
        int int31 = jsonPointer27.getMatchingIndex();
        boolean boolean32 = jsonPointer25.equals((java.lang.Object) jsonPointer27);
        java.lang.String str33 = jsonPointer25._matchingPropertyName;
        java.lang.String str34 = jsonPointer25.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer25);
        boolean boolean36 = jsonPointer20.equals((java.lang.Object) "");
        boolean boolean37 = jsonPointer1.equals((java.lang.Object) "");
        int int38 = jsonPointer1._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = jsonPointer1._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(jsonPointer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(jsonPointer39);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        java.lang.String str17 = jsonPointer1._asString;
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        int int17 = jsonPointer15.getMatchingIndex();
        java.lang.String str18 = jsonPointer15.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        int int20 = jsonPointer19.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer21);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        java.lang.String str16 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer25);
        int int28 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer27._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer27.tail();
        boolean boolean32 = jsonPointer27.mayMatchElement();
        int int33 = jsonPointer27._matchingElementIndex;
        boolean boolean34 = jsonPointer14.equals((java.lang.Object) jsonPointer27);
        java.lang.String str35 = jsonPointer14.getMatchingProperty();
        boolean boolean36 = jsonPointer14.mayMatchElement();
        java.lang.Class<?> wildcardClass37 = jsonPointer14.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertNotNull(jsonPointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = com.fasterxml.jackson.core.JsonPointer._parseQuotedTail("hi!", 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = jsonPointer2.equals(obj3);
        int int5 = jsonPointer2._matchingElementIndex;
        org.junit.Assert.assertNotNull(jsonPointer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0.matchProperty("hi!");
        int int4 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = jsonPointer0.matchProperty("hi!");
        boolean boolean7 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer8.matchElement((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        boolean boolean4 = jsonPointer0.matches();
        boolean boolean5 = jsonPointer0.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer6.matchElement((int) (short) -1);
        java.lang.String str9 = jsonPointer6._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer6._nextSegment;
        java.lang.String str11 = jsonPointer6._matchingPropertyName;
        int int12 = jsonPointer6.getMatchingIndex();
        boolean boolean13 = jsonPointer0.equals((java.lang.Object) int12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jsonPointer6);
        org.junit.Assert.assertNull(jsonPointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        java.lang.String str18 = jsonPointer0.toString();
        boolean boolean19 = jsonPointer0.mayMatchProperty();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        int int3 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer2.matchProperty("hi!");
        boolean boolean6 = jsonPointer2.mayMatchElement();
        boolean boolean7 = jsonPointer2.mayMatchProperty();
        int int8 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer2);
        boolean boolean10 = jsonPointer2.matches();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        java.lang.String str10 = jsonPointer5._matchingPropertyName;
        int int11 = jsonPointer5.getMatchingIndex();
        java.lang.String str12 = jsonPointer5.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        int int14 = jsonPointer5._matchingElementIndex;
        boolean boolean15 = jsonPointer5.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("i!", "i!", jsonPointer5);
        boolean boolean17 = jsonPointer16.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer9.matchElement((int) (short) -1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer9._nextSegment;
        boolean boolean21 = jsonPointer9.matches();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jsonPointer19);
        org.junit.Assert.assertNotNull(jsonPointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str5 = jsonPointer4._matchingPropertyName;
        boolean boolean6 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer4._nextSegment;
        java.lang.String str8 = jsonPointer4.toString();
        boolean boolean9 = jsonPointer4.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer4);
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer10._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer10.tail();
        boolean boolean15 = jsonPointer14.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14._nextSegment;
        boolean boolean18 = jsonPointer14.matches();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        int int4 = jsonPointer0._matchingElementIndex;
        int int5 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        boolean boolean20 = jsonPointer18.mayMatchElement();
        int int21 = jsonPointer18.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertNotNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchProperty("~hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertNull(jsonPointer7);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = jsonPointer0.tail();
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        int int5 = jsonPointer0._matchingElementIndex;
        java.lang.String str6 = jsonPointer0.getMatchingProperty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(jsonPointer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14.getMatchingProperty();
        java.lang.String str16 = jsonPointer14.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer25);
        int int28 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer27._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer31 = jsonPointer27.tail();
        boolean boolean32 = jsonPointer27.mayMatchElement();
        int int33 = jsonPointer27._matchingElementIndex;
        boolean boolean34 = jsonPointer14.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer14.matchProperty("hi!");
        java.lang.Class<?> wildcardClass37 = jsonPointer36.getClass();
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertNotNull(jsonPointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jsonPointer36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = com.fasterxml.jackson.core.JsonPointer.EMPTY;
        boolean boolean1 = jsonPointer0.matches();
        java.lang.String str2 = jsonPointer0.getMatchingProperty();
        java.lang.String str3 = jsonPointer0.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer0._nextSegment;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jsonPointer4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        java.lang.String str1 = jsonPointer0._matchingPropertyName;
        boolean boolean2 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.toString();
        int int5 = jsonPointer0.getMatchingIndex();
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        boolean boolean7 = jsonPointer0.matches();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        java.lang.String str39 = jsonPointer23._matchingPropertyName;
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        boolean boolean12 = jsonPointer11.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer11.tail();
        java.lang.String str14 = jsonPointer11._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer11.tail();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonPointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(jsonPointer15);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str4 = jsonPointer3._matchingPropertyName;
        boolean boolean5 = jsonPointer3.mayMatchElement();
        boolean boolean6 = jsonPointer3.mayMatchProperty();
        int int7 = jsonPointer3._matchingElementIndex;
        java.lang.String str8 = jsonPointer3.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer();
        int int15 = jsonPointer14._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = jsonPointer14.tail();
        boolean boolean17 = jsonPointer14.mayMatchProperty();
        boolean boolean18 = jsonPointer14.mayMatchElement();
        int int19 = jsonPointer14.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer14);
        boolean boolean21 = jsonPointer20.mayMatchProperty();
        boolean boolean22 = jsonPointer20.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer20);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer20.tail();
        boolean boolean25 = jsonPointer20.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str28 = jsonPointer27._matchingPropertyName;
        boolean boolean29 = jsonPointer27.mayMatchElement();
        boolean boolean30 = jsonPointer27.mayMatchProperty();
        int int31 = jsonPointer27._matchingElementIndex;
        boolean boolean32 = jsonPointer20.equals((java.lang.Object) jsonPointer27);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer20.tail();
        java.lang.String str34 = jsonPointer33._asString;
        int int35 = jsonPointer33._matchingElementIndex;
        boolean boolean36 = jsonPointer3.equals((java.lang.Object) int35);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonPointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        int int6 = jsonPointer3.getMatchingIndex();
        int int7 = jsonPointer3.getMatchingIndex();
        boolean boolean8 = jsonPointer3.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer3.matchElement((int) (short) 100);
        java.lang.String str11 = jsonPointer3._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = new com.fasterxml.jackson.core.JsonPointer("", "i!", jsonPointer3);
        java.lang.String str13 = jsonPointer3.toString();
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        java.lang.String str2 = jsonPointer0._asString;
        java.lang.String str3 = jsonPointer0._matchingPropertyName;
        java.lang.String str4 = jsonPointer0.toString();
        java.lang.String str5 = jsonPointer0.getMatchingProperty();
        java.lang.String str6 = jsonPointer0._asString;
        java.lang.String str7 = jsonPointer0._asString;
        java.lang.Class<?> wildcardClass8 = jsonPointer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer6 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer5);
        boolean boolean8 = jsonPointer7.mayMatchElement();
        java.lang.String str9 = jsonPointer7.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer7.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer10.matchProperty("~i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = jsonPointer12.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonPointer10);
        org.junit.Assert.assertNull(jsonPointer12);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer9);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer9);
        java.lang.String str12 = jsonPointer11.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer11);
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer13);
        java.lang.String str15 = jsonPointer14._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer14.matchElement((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer17.tail();
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
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        boolean boolean15 = jsonPointer12.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer12.matchProperty("i!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer25);
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer25);
        int int28 = jsonPointer27._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = jsonPointer27._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer27);
        boolean boolean31 = jsonPointer30.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer35 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer35.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = jsonPointer35.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer35);
        boolean boolean41 = jsonPointer30.equals((java.lang.Object) jsonPointer40);
        boolean boolean42 = jsonPointer30.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer46 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer47 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer46);
        java.lang.String str48 = jsonPointer46._asString;
        java.lang.String str49 = jsonPointer46._matchingPropertyName;
        java.lang.String str50 = jsonPointer46._asString;
        boolean boolean51 = jsonPointer30.equals((java.lang.Object) str50);
        boolean boolean52 = jsonPointer12.equals((java.lang.Object) str50);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jsonPointer17);
        org.junit.Assert.assertNotNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonPointer35);
        org.junit.Assert.assertNull(jsonPointer37);
        org.junit.Assert.assertNull(jsonPointer39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonPointer46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int6 = jsonPointer5._matchingElementIndex;
        java.lang.String str7 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        int int9 = jsonPointer5._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer5);
        int int11 = jsonPointer10.getMatchingIndex();
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        java.lang.String str20 = jsonPointer9._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer9._nextSegment;
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(jsonPointer21);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer23.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer23.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer23);
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
        org.junit.Assert.assertNotNull(jsonPointer27);
        org.junit.Assert.assertNotNull(jsonPointer28);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer24.tail();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = jsonPointer33.mayMatchProperty();
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
        org.junit.Assert.assertNull(jsonPointer33);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer3);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer();
        int int10 = jsonPointer9._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer9.tail();
        boolean boolean12 = jsonPointer9.mayMatchProperty();
        boolean boolean13 = jsonPointer9.mayMatchElement();
        int int14 = jsonPointer9.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer9);
        boolean boolean16 = jsonPointer15.mayMatchProperty();
        boolean boolean17 = jsonPointer15.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer15);
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = jsonPointer15.tail();
        boolean boolean20 = jsonPointer15.mayMatchElement();
        java.lang.String str21 = jsonPointer15.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer22 = jsonPointer15._nextSegment;
        boolean boolean23 = jsonPointer4.equals((java.lang.Object) jsonPointer22);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonPointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer5.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer5);
        boolean boolean11 = jsonPointer5.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer5.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        int int15 = jsonPointer5._matchingElementIndex;
        boolean boolean16 = jsonPointer5.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer5._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonPointer12);
        org.junit.Assert.assertNull(jsonPointer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonPointer17);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer10 = jsonPointer0._nextSegment;
        boolean boolean11 = jsonPointer0.mayMatchProperty();
        java.lang.String str12 = jsonPointer0._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = new com.fasterxml.jackson.core.JsonPointer();
        int int14 = jsonPointer13._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = jsonPointer13.tail();
        boolean boolean16 = jsonPointer13.mayMatchProperty();
        boolean boolean17 = jsonPointer13.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = new com.fasterxml.jackson.core.JsonPointer();
        int int19 = jsonPointer18._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer20 = jsonPointer18.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer18.tail();
        java.lang.Class<?> wildcardClass22 = jsonPointer18.getClass();
        boolean boolean23 = jsonPointer13.equals((java.lang.Object) jsonPointer18);
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = jsonPointer13.tail();
        boolean boolean25 = jsonPointer13.mayMatchElement();
        java.lang.String str26 = jsonPointer13._matchingPropertyName;
        boolean boolean27 = jsonPointer13.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean33 = jsonPointer32.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer();
        int int35 = jsonPointer34._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer34.tail();
        boolean boolean37 = jsonPointer34.mayMatchProperty();
        int int38 = jsonPointer34.getMatchingIndex();
        boolean boolean39 = jsonPointer32.equals((java.lang.Object) jsonPointer34);
        java.lang.String str40 = jsonPointer32.getMatchingProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer41 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer32);
        com.fasterxml.jackson.core.JsonPointer jsonPointer43 = jsonPointer41.matchProperty("hi!");
        java.lang.String str44 = jsonPointer41._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer46 = jsonPointer41.matchProperty("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer47 = jsonPointer41._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer48 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer41);
        com.fasterxml.jackson.core.JsonPointer jsonPointer50 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer52 = jsonPointer50.matchElement((int) (short) 1);
        boolean boolean53 = jsonPointer50.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer61 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer62 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer61);
        com.fasterxml.jackson.core.JsonPointer jsonPointer63 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer61);
        int int64 = jsonPointer63._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer65 = jsonPointer63._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer66 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer63);
        boolean boolean67 = jsonPointer66.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer71 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer73 = jsonPointer71.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer75 = jsonPointer71.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer76 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer71);
        boolean boolean77 = jsonPointer66.equals((java.lang.Object) jsonPointer76);
        boolean boolean78 = jsonPointer50.equals((java.lang.Object) jsonPointer76);
        boolean boolean79 = jsonPointer41.equals((java.lang.Object) jsonPointer76);
        java.lang.String str80 = jsonPointer76._asString;
        boolean boolean81 = jsonPointer13.equals((java.lang.Object) jsonPointer76);
        boolean boolean82 = jsonPointer0.equals((java.lang.Object) boolean81);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonPointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(jsonPointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonPointer20);
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(jsonPointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(jsonPointer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(jsonPointer43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(jsonPointer46);
        org.junit.Assert.assertNotNull(jsonPointer47);
        org.junit.Assert.assertNotNull(jsonPointer50);
        org.junit.Assert.assertNull(jsonPointer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jsonPointer61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jsonPointer71);
        org.junit.Assert.assertNull(jsonPointer73);
        org.junit.Assert.assertNull(jsonPointer75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        boolean boolean4 = jsonPointer1.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer1.tail();
        boolean boolean6 = jsonPointer1.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer1._nextSegment;
        java.lang.String str8 = jsonPointer1.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer1._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer1.matchElement((int) (byte) 0);
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(jsonPointer9);
        org.junit.Assert.assertNull(jsonPointer11);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer7);
        java.lang.String str10 = jsonPointer9.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer9);
        java.lang.String str12 = jsonPointer9._matchingPropertyName;
        boolean boolean13 = jsonPointer9.mayMatchProperty();
        boolean boolean14 = jsonPointer9.mayMatchElement();
        java.lang.String str15 = jsonPointer9._matchingPropertyName;
        boolean boolean16 = jsonPointer9.mayMatchProperty();
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        boolean boolean16 = jsonPointer10.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = jsonPointer10.tail();
        java.lang.String str18 = jsonPointer17.toString();
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
        org.junit.Assert.assertNotNull(jsonPointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = jsonPointer3.matchElement((int) (short) 1);
        boolean boolean6 = jsonPointer3.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer15 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer14);
        com.fasterxml.jackson.core.JsonPointer jsonPointer16 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer14);
        int int17 = jsonPointer16._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer18 = jsonPointer16._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer16);
        boolean boolean20 = jsonPointer19.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer24 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer26 = jsonPointer24.matchElement((int) (short) 1);
        com.fasterxml.jackson.core.JsonPointer jsonPointer28 = jsonPointer24.matchElement((int) ' ');
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer24);
        boolean boolean30 = jsonPointer19.equals((java.lang.Object) jsonPointer29);
        boolean boolean31 = jsonPointer3.equals((java.lang.Object) jsonPointer29);
        java.lang.String str32 = jsonPointer29.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = new com.fasterxml.jackson.core.JsonPointer("hi!", "~i!", jsonPointer29);
        org.junit.Assert.assertNotNull(jsonPointer3);
        org.junit.Assert.assertNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonPointer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonPointer24);
        org.junit.Assert.assertNull(jsonPointer26);
        org.junit.Assert.assertNull(jsonPointer28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        com.fasterxml.jackson.core.JsonPointer jsonPointer23 = new com.fasterxml.jackson.core.JsonPointer();
        int int24 = jsonPointer23._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer23.tail();
        boolean boolean26 = jsonPointer23.mayMatchProperty();
        boolean boolean27 = jsonPointer23.mayMatchElement();
        int int28 = jsonPointer23.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = new com.fasterxml.jackson.core.JsonPointer("hi!", "hi!", jsonPointer23);
        boolean boolean30 = jsonPointer29.mayMatchProperty();
        boolean boolean31 = jsonPointer29.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer29);
        com.fasterxml.jackson.core.JsonPointer jsonPointer33 = jsonPointer29.tail();
        java.lang.String str34 = jsonPointer33._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer36 = jsonPointer33.matchElement((int) '4');
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer33);
        com.fasterxml.jackson.core.JsonPointer jsonPointer38 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer33);
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer38);
        com.fasterxml.jackson.core.JsonPointer jsonPointer43 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str44 = jsonPointer43._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer45 = jsonPointer43._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer46 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer45);
        boolean boolean47 = jsonPointer46.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer49 = jsonPointer46.matchProperty("");
        boolean boolean50 = jsonPointer39.equals((java.lang.Object) jsonPointer46);
        boolean boolean51 = jsonPointer11.equals((java.lang.Object) jsonPointer39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonPointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonPointer33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(jsonPointer36);
        org.junit.Assert.assertNotNull(jsonPointer43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(jsonPointer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer._parseTail("hi!");
        java.lang.String str6 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = jsonPointer5._nextSegment;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer7);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer8);
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = jsonPointer8.matchProperty("hi!");
        java.lang.String str12 = jsonPointer8._asString;
        java.lang.String str13 = jsonPointer8._matchingPropertyName;
        com.fasterxml.jackson.core.JsonPointer jsonPointer14 = jsonPointer8._nextSegment;
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer7);
        org.junit.Assert.assertNotNull(jsonPointer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(jsonPointer14);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.compile("");
        int int2 = jsonPointer1.getMatchingIndex();
        java.lang.String str3 = jsonPointer1._matchingPropertyName;
        java.lang.String str4 = jsonPointer1._matchingPropertyName;
        java.lang.String str5 = jsonPointer1.getMatchingProperty();
        java.lang.String str6 = jsonPointer1.getMatchingProperty();
        boolean boolean7 = jsonPointer1.matches();
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean1 = jsonPointer0.mayMatchElement();
        int int2 = jsonPointer0._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer3 = jsonPointer0._nextSegment;
        java.lang.String str4 = jsonPointer0.getMatchingProperty();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        int int6 = jsonPointer0._matchingElementIndex;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(jsonPointer3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        int int23 = jsonPointer4.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer25 = jsonPointer4.matchProperty("hi!");
        com.fasterxml.jackson.core.JsonPointer jsonPointer27 = jsonPointer4.matchElement((int) (byte) 100);
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer();
        int int31 = jsonPointer30._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer30.tail();
        boolean boolean33 = jsonPointer30.mayMatchProperty();
        boolean boolean34 = jsonPointer30.mayMatchElement();
        int int35 = jsonPointer30.getMatchingIndex();
        boolean boolean36 = jsonPointer30.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer30);
        boolean boolean38 = jsonPointer37.matches();
        boolean boolean39 = jsonPointer4.equals((java.lang.Object) jsonPointer37);
        com.fasterxml.jackson.core.JsonPointer jsonPointer40 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer37);
        java.lang.Class<?> wildcardClass41 = jsonPointer37.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(jsonPointer25);
        org.junit.Assert.assertNull(jsonPointer27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(jsonPointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.fasterxml.jackson.core.JsonPointer jsonPointer0 = new com.fasterxml.jackson.core.JsonPointer();
        int int1 = jsonPointer0._matchingElementIndex;
        boolean boolean2 = jsonPointer0.matches();
        java.lang.String str3 = jsonPointer0.toString();
        boolean boolean4 = jsonPointer0.mayMatchProperty();
        java.lang.String str5 = jsonPointer0._matchingPropertyName;
        boolean boolean6 = jsonPointer0.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = jsonPointer0.matchElement((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonPointer8);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7.tail();
        boolean boolean13 = jsonPointer12.mayMatchElement();
        java.lang.Class<?> wildcardClass14 = jsonPointer12.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.fasterxml.jackson.core.JsonPointer jsonPointer1 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        java.lang.String str2 = jsonPointer1._matchingPropertyName;
        boolean boolean3 = jsonPointer1.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer1.tail();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = jsonPointer4._matchingElementIndex;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonPointer1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.fasterxml.jackson.core.JsonPointer jsonPointer5 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        int int6 = jsonPointer5._matchingElementIndex;
        java.lang.String str7 = jsonPointer5._asString;
        com.fasterxml.jackson.core.JsonPointer jsonPointer8 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer5);
        boolean boolean9 = jsonPointer5.mayMatchElement();
        boolean boolean10 = jsonPointer5.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer11 = new com.fasterxml.jackson.core.JsonPointer("i!", "i!", jsonPointer5);
        org.junit.Assert.assertNotNull(jsonPointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.fasterxml.jackson.core.JsonPointer jsonPointer2 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean3 = jsonPointer2.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer4 = jsonPointer2._nextSegment;
        int int5 = jsonPointer2._matchingElementIndex;
        int int6 = jsonPointer2._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer7 = new com.fasterxml.jackson.core.JsonPointer("", "", jsonPointer2);
        com.fasterxml.jackson.core.JsonPointer jsonPointer9 = jsonPointer7.matchProperty("");
        boolean boolean10 = jsonPointer7.mayMatchElement();
        boolean boolean11 = jsonPointer7.matches();
        com.fasterxml.jackson.core.JsonPointer jsonPointer12 = jsonPointer7.tail();
        com.fasterxml.jackson.core.JsonPointer jsonPointer13 = jsonPointer7._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonPointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonPointer12);
        org.junit.Assert.assertNotNull(jsonPointer13);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        int int14 = jsonPointer2.getMatchingIndex();
        com.fasterxml.jackson.core.JsonPointer jsonPointer17 = new com.fasterxml.jackson.core.JsonPointer();
        boolean boolean18 = jsonPointer17.mayMatchElement();
        com.fasterxml.jackson.core.JsonPointer jsonPointer19 = new com.fasterxml.jackson.core.JsonPointer();
        int int20 = jsonPointer19._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer21 = jsonPointer19.tail();
        boolean boolean22 = jsonPointer19.mayMatchProperty();
        int int23 = jsonPointer19.getMatchingIndex();
        boolean boolean24 = jsonPointer17.equals((java.lang.Object) jsonPointer19);
        boolean boolean25 = jsonPointer17.mayMatchProperty();
        com.fasterxml.jackson.core.JsonPointer jsonPointer29 = com.fasterxml.jackson.core.JsonPointer.valueOf("");
        com.fasterxml.jackson.core.JsonPointer jsonPointer30 = new com.fasterxml.jackson.core.JsonPointer("hi!", "", jsonPointer29);
        boolean boolean31 = jsonPointer17.equals((java.lang.Object) jsonPointer30);
        com.fasterxml.jackson.core.JsonPointer jsonPointer32 = jsonPointer30.tail();
        java.lang.String str33 = jsonPointer30.toString();
        com.fasterxml.jackson.core.JsonPointer jsonPointer34 = new com.fasterxml.jackson.core.JsonPointer("", "hi!", jsonPointer30);
        int int35 = jsonPointer30.getMatchingIndex();
        int int36 = jsonPointer30._matchingElementIndex;
        com.fasterxml.jackson.core.JsonPointer jsonPointer37 = jsonPointer30.tail();
        boolean boolean38 = jsonPointer2.equals((java.lang.Object) jsonPointer30);
        com.fasterxml.jackson.core.JsonPointer jsonPointer39 = jsonPointer2._nextSegment;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(jsonPointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(jsonPointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jsonPointer29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonPointer32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(jsonPointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(jsonPointer39);
    }
}

