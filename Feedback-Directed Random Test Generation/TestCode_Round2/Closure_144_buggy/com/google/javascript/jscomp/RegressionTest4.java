package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParamsNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTemplateName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withInferredReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withSourceNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withParamsNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder11.withSourceNode(node18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder7.withInferredReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder3.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTemplateName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withParamsNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withParamsNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withParamsNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withParams(functionParamBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder7.withReturnType(jSType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.withTypeOfThis(objectType11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withReturnType(jSType13);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder1.withParamsNode(node15);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withReturnType(jSType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParamsNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder10.withTypeOfThis(objectType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder10.withParamsNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withSourceNode(node20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder19.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.copyFromOtherFunction(functionType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withParamsNode(node10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder3.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder3.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withReturnType(jSType19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withReturnType(jSType6);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withParamsNode(node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.copyFromOtherFunction(functionType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withName("Unknown class name");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder9.withParamsNode(node18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder9.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder21.forConstructor();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder21.withParamsNode(node23);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder10.withParams(functionParamBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withParamsNode(node16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withTypeOfThis(objectType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder13.withName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType22 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTemplateName("hi!");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withParamsNode(node19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withSourceNode(node16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTypeOfThis(objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withTypeOfThis(objectType20);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTypeOfThis(objectType12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withParamsNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withSourceNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withName("Not declared as a constructor");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withParamsNode(node16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder11.withInferredReturnType(jSType18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParamsNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder13.withInferredReturnType(jSType19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withSourceNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withReturnType(jSType16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder15.withTypeOfThis(objectType17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParamsNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder18.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.withInferredReturnType(jSType23);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withReturnType(jSType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("");
        java.lang.Class<?> wildcardClass12 = functionBuilder11.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withName("");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withReturnType(jSType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withSourceNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withTemplateName("");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParams(functionParamBuilder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder9.withParamsNode(node13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder9.withInferredReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder9.copyFromOtherFunction(functionType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder7.withInferredReturnType(jSType13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder18.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withInferredReturnType(jSType5);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withTemplateName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withTemplateName("");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder3.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder3.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder3.withName("");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder1.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder1.withReturnType(jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withSourceNode(node22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withParamsNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withTypeOfThis(objectType18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder15.withSourceNode(node20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder15.withInferredReturnType(jSType22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("Unknown class name");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withParamsNode(node12);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withSourceNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withSourceNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withSourceNode(node18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder19.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder19.withInferredReturnType(jSType21);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withInferredReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder1.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder1.withTemplateName("Named type with empty name component");
        java.lang.Class<?> wildcardClass20 = functionBuilder19.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTypeOfThis(objectType10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withReturnType(jSType19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder5.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder5.withSourceNode(node15);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder5.withInferredReturnType(jSType17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withReturnType(jSType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder16.withTypeOfThis(objectType21);
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder22.withInferredReturnType(jSType23);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder1.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withSourceNode(node9);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder11.copyFromOtherFunction(functionType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withParamsNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withSourceNode(node10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withParamsNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withSourceNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTemplateName("");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withSourceNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder7.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder7.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withInferredReturnType(jSType17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder6.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder6.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withName("");
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withReturnType(jSType18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withSourceNode(node16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withReturnType(jSType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder13.withTypeOfThis(objectType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withSourceNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder17.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withTypeOfThis(objectType10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType12 = functionBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withSourceNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder19.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder19.withTypeOfThis(objectType21);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withParamsNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withSourceNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.copyFromOtherFunction(functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder9.withTemplateName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withSourceNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParamsNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withParamsNode(node18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType20 = functionBuilder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withReturnType(jSType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Not declared as a constructor");
        java.lang.Class<?> wildcardClass14 = functionBuilder13.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withReturnType(jSType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTypeOfThis(objectType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withName("Unknown class name");
        java.lang.Class<?> wildcardClass24 = functionBuilder19.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withSourceNode(node18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withTemplateName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.copyFromOtherFunction(functionType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder17.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withParamsNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withSourceNode(node18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTemplateName("Unknown class name");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withTypeOfThis(objectType24);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder23.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder29 = functionBuilder23.withReturnType(jSType28);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
        org.junit.Assert.assertNotNull(functionBuilder27);
        org.junit.Assert.assertNotNull(functionBuilder29);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withReturnType(jSType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType13 = functionBuilder12.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder21.withParamsNode(node24);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder12.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder12.withTemplateName("");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withInferredReturnType(jSType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withSourceNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withSourceNode(node18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withReturnType(jSType15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.copyFromOtherFunction(functionType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withInferredReturnType(jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder15.withReturnType(jSType20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder15.withParamsNode(node22);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withReturnType(jSType24);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder23.withParams(functionParamBuilder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withParamsNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withSourceNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withSourceNode(node16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.copyFromOtherFunction(functionType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder4.withTemplateName("");
        java.lang.Class<?> wildcardClass7 = functionBuilder4.getClass();
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withTemplateName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTemplateName("Unknown class name");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParamsNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Unknown class name");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withTypeOfThis(objectType16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = functionBuilder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withTypeOfThis(objectType10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTypeOfThis(objectType12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType14 = functionBuilder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.copyFromOtherFunction(functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withParamsNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withSourceNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withSourceNode(node16);
        java.lang.Class<?> wildcardClass18 = functionBuilder17.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParamsNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParams(functionParamBuilder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withSourceNode(node10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withReturnType(jSType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withTemplateName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withName("Unknown class name");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withSourceNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withParamsNode(node20);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withName("");
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withReturnType(jSType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder19.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withParamsNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withTypeOfThis(objectType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withSourceNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTypeOfThis(objectType18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withSourceNode(node9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withTypeOfThis(objectType11);
        java.lang.Class<?> wildcardClass13 = functionBuilder12.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParamsNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("hi!");
        java.lang.Class<?> wildcardClass16 = functionBuilder15.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withReturnType(jSType15);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withSourceNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = functionBuilder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withInferredReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.copyFromOtherFunction(functionType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withSourceNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder11.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder11.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withInferredReturnType(jSType22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withSourceNode(node15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTypeOfThis(objectType17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withReturnType(jSType8);
        java.lang.Class<?> wildcardClass10 = functionBuilder7.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder17.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder17.copyFromOtherFunction(functionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder7.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder14.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withSourceNode(node19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder22.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withSourceNode(node16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder13.withInferredReturnType(jSType18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType20 = functionBuilder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder11.withReturnType(jSType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withParamsNode(node17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withReturnType(jSType11);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withName("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder1.withSourceNode(node16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType18 = functionBuilder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withTypeOfThis(objectType24);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder23.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType28 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder29 = functionBuilder23.withInferredReturnType(jSType28);
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder31 = functionBuilder29.withTypeOfThis(objectType30);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
        org.junit.Assert.assertNotNull(functionBuilder27);
        org.junit.Assert.assertNotNull(functionBuilder29);
        org.junit.Assert.assertNotNull(functionBuilder31);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withInferredReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder5.withParamsNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder5.withTypeOfThis(objectType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withSourceNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("Named type with empty name component");
        java.lang.Class<?> wildcardClass10 = functionBuilder3.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.withTypeOfThis(objectType19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withSourceNode(node10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withInferredReturnType(jSType22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTypeOfThis(objectType10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withSourceNode(node22);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder23.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder27 = functionBuilder25.withTemplateName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
        org.junit.Assert.assertNotNull(functionBuilder27);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withInferredReturnType(jSType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder9.withSourceNode(node18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.copyFromOtherFunction(functionType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withReturnType(jSType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withSourceNode(node18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withTemplateName("Unknown class name");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withSourceNode(node16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder7.withTypeOfThis(objectType18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withSourceNode(node20);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.copyFromOtherFunction(functionType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParams(functionParamBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withSourceNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        java.lang.Class<?> wildcardClass16 = functionBuilder15.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withParamsNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParamsNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.copyFromOtherFunction(functionType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParams(functionParamBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withReturnType(jSType4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withInferredReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder1.withParamsNode(node16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder1.withTypeOfThis(objectType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder1.withTemplateName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder1.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder17.withInferredReturnType(jSType22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withInferredReturnType(jSType15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType17 = functionBuilder14.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withSourceNode(node17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withSourceNode(node18);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.copyFromOtherFunction(functionType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder3.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withParamsNode(node6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder15.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withTemplateName("");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withReturnType(jSType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withSourceNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParamsNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withName("Not declared as a constructor");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder3.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withName("Unknown class name");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder9.withParamsNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withParamsNode(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withParamsNode(node22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder3.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withTypeOfThis(objectType13);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withInferredReturnType(jSType15);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder5.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder5.withSourceNode(node14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTypeOfThis(objectType16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withParamsNode(node9);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder2.withParams(functionParamBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder2);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTemplateName("");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withParamsNode(node11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withReturnType(jSType15);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withParamsNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder7.withSourceNode(node18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder7.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withSourceNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withSourceNode(node20);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder21.withTypeOfThis(objectType22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withSourceNode(node6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withReturnType(jSType8);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withReturnType(jSType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withSourceNode(node6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParams(functionParamBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withReturnType(jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder19.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder24.withReturnType(jSType25);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder28 = functionBuilder26.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder30 = functionBuilder28.withTemplateName("Named type with empty name component");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder24);
        org.junit.Assert.assertNotNull(functionBuilder26);
        org.junit.Assert.assertNotNull(functionBuilder28);
        org.junit.Assert.assertNotNull(functionBuilder30);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withParamsNode(node13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTypeOfThis(objectType15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withSourceNode(node17);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withParams(functionParamBuilder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.copyFromOtherFunction(functionType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withInferredReturnType(jSType11);
        java.lang.Class<?> wildcardClass13 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withReturnType(jSType19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withInferredReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withParamsNode(node16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder7.withInferredReturnType(jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withTypeOfThis(objectType22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withName("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.copyFromOtherFunction(functionType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder5.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withSourceNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withParamsNode(node8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTypeOfThis(objectType10);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("Not declared as a constructor");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withSourceNode(node20);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withTemplateName("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withParamsNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder5.withSourceNode(node9);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withInferredReturnType(jSType13);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        java.lang.Class<?> wildcardClass11 = functionBuilder10.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder15.withSourceNode(node20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType22 = functionBuilder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder8.withInferredReturnType(jSType11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder8.withInferredReturnType(jSType13);
        java.lang.Class<?> wildcardClass15 = functionBuilder8.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType22 = functionBuilder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withTemplateName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder18.withReturnType(jSType19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder18.withParamsNode(node21);
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder18.withTypeOfThis(objectType23);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        java.lang.Class<?> wildcardClass16 = functionBuilder15.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder12.forConstructor();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.copyFromOtherFunction(functionType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder1.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("hi!");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withSourceNode(node20);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder1.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder1.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder17.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder15.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder15.withInferredReturnType(jSType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder15.withTypeOfThis(objectType21);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withInferredReturnType(jSType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withParamsNode(node8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withInferredReturnType(jSType14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.copyFromOtherFunction(functionType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withReturnType(jSType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder9.withTypeOfThis(objectType11);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("Unknown class name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTemplateName("Unknown class name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParams(functionParamBuilder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParamsNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withParamsNode(node14);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withTypeOfThis(objectType18);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder15.copyFromOtherFunction(functionType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withParamsNode(node16);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withName("Not declared as a constructor");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder17.withParamsNode(node20);
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder17.copyFromOtherFunction(functionType22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withReturnType(jSType18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withSourceNode(node20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withReturnType(jSType22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.copyFromOtherFunction(functionType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.FunctionTypeBuilder.INEXISTANT_PARAM;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder8.withSourceNode(node9);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder15.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder15.withInferredReturnType(jSType19);
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withInferredReturnType(jSType21);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withTypeOfThis(objectType4);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder5.forConstructor();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withParamsNode(node7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder6.withName("hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder6.withParamsNode(node11);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withInferredReturnType(jSType12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withSourceNode(node14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder16.withReturnType(jSType17);
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder16.copyFromOtherFunction(functionType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder15.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder15.withInferredReturnType(jSType17);
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder15.withInferredReturnType(jSType19);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder20.withName("hi!");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
        org.junit.Assert.assertNotNull(functionBuilder22);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withParamsNode(node10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder3.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder13.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withInferredReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withParams(functionParamBuilder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withReturnType(jSType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withReturnType(jSType14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withSourceNode(node16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withInferredReturnType(jSType18);
        java.lang.Class<?> wildcardClass20 = functionBuilder19.getClass();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withParamsNode(node8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder10 = functionBuilder7.forConstructor();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder10.withSourceNode(node11);
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder10.withInferredReturnType(jSType13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder10.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder10.withName("Not declared as a constructor");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder10);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder1.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder11.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder14.withTypeOfThis(objectType19);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withName("Not declared as a constructor");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withSourceNode(node16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder7.withParamsNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder7.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder7.withTypeOfThis(objectType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withInferredReturnType(jSType18);
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withInferredReturnType(jSType22);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withReturnType(jSType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder11.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.FunctionParamBuilder functionParamBuilder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder11.withParams(functionParamBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder1.withTypeOfThis(objectType8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withParamsNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withSourceNode(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTypeOfThis(objectType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withReturnType(jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withReturnType(jSType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withTemplateName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder22 = functionBuilder21.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder24 = functionBuilder21.withReturnType(jSType23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder26 = functionBuilder24.withParamsNode(node25);
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder28 = functionBuilder26.withTypeOfThis(objectType27);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder22);
        org.junit.Assert.assertNotNull(functionBuilder24);
        org.junit.Assert.assertNotNull(functionBuilder26);
        org.junit.Assert.assertNotNull(functionBuilder28);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder9.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder9.withReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder9.withInferredReturnType(jSType16);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withParamsNode(node2);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withName("");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder5.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder5.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder5.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder13.forConstructor();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder14.withSourceNode(node15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder14.withTypeOfThis(objectType17);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder18.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withReturnType(jSType4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder5.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withInferredReturnType(jSType8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTypeOfThis(objectType12);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withInferredReturnType(jSType18);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder20 = functionBuilder19.forConstructor();
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder20);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withName("hi!");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder12 = functionBuilder11.forConstructor();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder14 = functionBuilder12.withSourceNode(node13);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder16 = functionBuilder12.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder18 = functionBuilder12.withName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder12.forConstructor();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder21 = functionBuilder19.withInferredReturnType(jSType20);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder23 = functionBuilder19.withTemplateName("Unknown class name");
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder25 = functionBuilder19.withTypeOfThis(objectType24);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder12);
        org.junit.Assert.assertNotNull(functionBuilder14);
        org.junit.Assert.assertNotNull(functionBuilder16);
        org.junit.Assert.assertNotNull(functionBuilder18);
        org.junit.Assert.assertNotNull(functionBuilder19);
        org.junit.Assert.assertNotNull(functionBuilder21);
        org.junit.Assert.assertNotNull(functionBuilder23);
        org.junit.Assert.assertNotNull(functionBuilder25);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withSourceNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder3.withSourceNode(node10);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder3.withInferredReturnType(jSType12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder3.withTemplateName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType16 = functionBuilder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.copyFromOtherFunction(functionType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withInferredReturnType(jSType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder11.withInferredReturnType(jSType14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withInferredReturnType(jSType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder15.withSourceNode(node18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withSourceNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder1.withSourceNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder1.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withTypeOfThis(objectType8);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withTemplateName("Named type with empty name component");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.FunctionType functionType12 = functionBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder3.withName("Named type with empty name component");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder9.withSourceNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withSourceNode(node12);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withName("Not declared as a type name");
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder2 = functionBuilder1.forConstructor();
        com.google.javascript.rhino.jstype.ObjectType objectType3 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder4 = functionBuilder1.withTypeOfThis(objectType3);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder6 = functionBuilder1.withName("Not declared as a constructor");
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder8 = functionBuilder6.withReturnType(jSType7);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder8.forConstructor();
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder8.withTemplateName("Named type with empty name component");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withParamsNode(node12);
        org.junit.Assert.assertNotNull(functionBuilder2);
        org.junit.Assert.assertNotNull(functionBuilder4);
        org.junit.Assert.assertNotNull(functionBuilder6);
        org.junit.Assert.assertNotNull(functionBuilder8);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder1 = new com.google.javascript.rhino.jstype.FunctionBuilder(jSTypeRegistry0);
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder3 = functionBuilder1.withReturnType(jSType2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder5 = functionBuilder3.withParamsNode(node4);
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder7 = functionBuilder3.withTypeOfThis(objectType6);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder9 = functionBuilder7.withName("");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder11 = functionBuilder7.withTypeOfThis(objectType10);
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder13 = functionBuilder11.withName("Unknown class name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder15 = functionBuilder13.withTemplateName("Not declared as a type name");
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder17 = functionBuilder15.withTemplateName("hi!");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.FunctionBuilder functionBuilder19 = functionBuilder17.withParamsNode(node18);
        org.junit.Assert.assertNotNull(functionBuilder3);
        org.junit.Assert.assertNotNull(functionBuilder5);
        org.junit.Assert.assertNotNull(functionBuilder7);
        org.junit.Assert.assertNotNull(functionBuilder9);
        org.junit.Assert.assertNotNull(functionBuilder11);
        org.junit.Assert.assertNotNull(functionBuilder13);
        org.junit.Assert.assertNotNull(functionBuilder15);
        org.junit.Assert.assertNotNull(functionBuilder17);
        org.junit.Assert.assertNotNull(functionBuilder19);
    }
}

