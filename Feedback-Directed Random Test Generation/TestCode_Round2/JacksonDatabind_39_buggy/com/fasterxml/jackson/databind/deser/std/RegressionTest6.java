package com.fasterxml.jackson.databind.deser.std;

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
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType15 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = nullifyingDeserializer0.getNullValue(deserializationContext18);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer20);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        boolean boolean14 = objJsonDeserializer13.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = objJsonDeserializer13.getEmptyValue(deserializationContext15);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer16);
        java.lang.Object obj18 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean19 = nullifyingDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean9 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean7 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = nullifyingDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        boolean boolean7 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection15 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = nullifyingDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection17 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer18);
        java.lang.Object obj20 = objJsonDeserializer19.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty22 = objJsonDeserializer19.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer14 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer14.handledType();
        java.lang.Object obj16 = nullifyingDeserializer14.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = nullifyingDeserializer14.unwrappingDeserializer(nameTransformer17);
        java.lang.Object obj19 = objJsonDeserializer18.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = objJsonDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        java.lang.Object obj22 = objJsonDeserializer18.getEmptyValue(deserializationContext21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = objJsonDeserializer11.deserialize(jsonParser12, deserializationContext13, obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
        org.junit.Assert.assertNotNull(nullifyingDeserializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(objectIdReader20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = nullifyingDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer0.getNullValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = nullifyingDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.handledType();
        boolean boolean11 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = nullifyingDeserializer0.getEmptyValue(deserializationContext14);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType10 = nullifyingDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = wildcardJsonDeserializer7.isCachable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.JavaType javaType14 = nullifyingDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection15 = nullifyingDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(objCollection15);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Object obj12 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Object obj14 = nullifyingDeserializer0.getEmptyValue(deserializationContext13);
        java.lang.Object obj15 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = nullifyingDeserializer0.deserialize(jsonParser16, deserializationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.util.Collection<java.lang.Object> objCollection12 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer0.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer17);
        boolean boolean19 = nullifyingDeserializer0.isCachable();
        boolean boolean20 = nullifyingDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty22 = nullifyingDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection8 = nullifyingDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection9 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = nullifyingDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = nullifyingDeserializer0.handledType();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.handledType();
        boolean boolean8 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj10 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer0.getEmptyValue(deserializationContext11);
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = nullifyingDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = wildcardJsonDeserializer14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue(deserializationContext14);
        java.lang.Object obj16 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objectIdReader17);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getNullValue(deserializationContext12);
        boolean boolean14 = nullifyingDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer0.getEmptyValue(deserializationContext11);
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer14);
        java.lang.Object obj16 = objJsonDeserializer15.getEmptyValue();
        java.lang.Object obj17 = objJsonDeserializer15.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = objJsonDeserializer15.getEmptyValue(deserializationContext18);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getNullValue();
        boolean boolean2 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JavaType javaType11 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = nullifyingDeserializer0.deserialize(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        boolean boolean9 = nullifyingDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection10 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = nullifyingDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = objJsonDeserializer9.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer14 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer14.getEmptyValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = nullifyingDeserializer14.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = nullifyingDeserializer14.getEmptyValue(deserializationContext18);
        java.lang.Object obj20 = nullifyingDeserializer14.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        java.lang.Object obj22 = nullifyingDeserializer14.getNullValue(deserializationContext21);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        java.lang.Object obj24 = nullifyingDeserializer14.getEmptyValue(deserializationContext23);
        java.lang.Class<?> wildcardClass25 = nullifyingDeserializer14.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext26 = null;
        java.lang.Object obj27 = nullifyingDeserializer14.getEmptyValue(deserializationContext26);
        java.lang.Class<?> wildcardClass28 = nullifyingDeserializer14.handledType();
        com.fasterxml.jackson.databind.JavaType javaType29 = nullifyingDeserializer14.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = objJsonDeserializer9.deserialize(jsonParser12, deserializationContext13, (java.lang.Object) javaType29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(nullifyingDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(javaType29);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = objJsonDeserializer13.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = objJsonDeserializer13.unwrappingDeserializer(nameTransformer16);
        java.lang.Object obj18 = objJsonDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        java.lang.Object obj20 = objJsonDeserializer17.getNullValue(deserializationContext19);
        java.lang.Object obj21 = objJsonDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = objJsonDeserializer17.unwrappingDeserializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = objJsonDeserializer17.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = null;
        java.lang.Object obj26 = objJsonDeserializer17.getEmptyValue(deserializationContext25);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objJsonDeserializer23);
        org.junit.Assert.assertNull(wildcardJsonDeserializer24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        boolean boolean1 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer3 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj4 = nullifyingDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = nullifyingDeserializer3.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = objJsonDeserializer6.unwrappingDeserializer(nameTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = nullifyingDeserializer0.replaceDelegatee(objJsonDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(nullifyingDeserializer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Object obj12 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer15 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass16 = nullifyingDeserializer15.handledType();
        java.lang.Object obj17 = nullifyingDeserializer15.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = nullifyingDeserializer15.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        java.lang.Object obj21 = nullifyingDeserializer15.getEmptyValue(deserializationContext20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = nullifyingDeserializer15.unwrappingDeserializer(nameTransformer22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = nullifyingDeserializer0.replaceDelegatee(objJsonDeserializer23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNotNull(nullifyingDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objJsonDeserializer23);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer12 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer12.handledType();
        java.lang.Object obj14 = nullifyingDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer12.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = nullifyingDeserializer12.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(nullifyingDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objectIdReader17);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.handledType();
        java.lang.Object obj13 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer14);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        boolean boolean5 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = objJsonDeserializer8.getEmptyValue(deserializationContext9);
        java.lang.Object obj11 = objJsonDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = objJsonDeserializer8.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getNullValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = nullifyingDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Object obj12 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Object obj14 = nullifyingDeserializer0.getEmptyValue(deserializationContext13);
        java.lang.Object obj15 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean16 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer17);
        java.util.Collection<java.lang.Object> objCollection19 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Object obj20 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(objCollection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(objectIdReader21);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getNullValue();
        boolean boolean2 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType3 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj5 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer11 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer11.getEmptyValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer11.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer11.getEmptyValue(deserializationContext15);
        java.lang.Object obj17 = nullifyingDeserializer11.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = nullifyingDeserializer11.getNullValue(deserializationContext18);
        java.lang.Class<?> wildcardClass20 = nullifyingDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType21 = nullifyingDeserializer11.getValueType();
        boolean boolean22 = nullifyingDeserializer11.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = nullifyingDeserializer0.deserialize(jsonParser9, deserializationContext10, (java.lang.Object) nullifyingDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(nullifyingDeserializer11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean7 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue(deserializationContext8);
        boolean boolean10 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType11 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.lang.Object obj14 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = nullifyingDeserializer0.getNullValue(deserializationContext16);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = nullifyingDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass19 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = nullifyingDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = nullifyingDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean8 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean10 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer11 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer11.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = nullifyingDeserializer11.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer11.getNullValue(deserializationContext15);
        java.util.Collection<java.lang.Object> objCollection17 = nullifyingDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = nullifyingDeserializer11.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = nullifyingDeserializer11.unwrappingDeserializer(nameTransformer20);
        java.lang.Class<?> wildcardClass22 = nullifyingDeserializer11.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nullifyingDeserializer11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(objJsonDeserializer19);
        org.junit.Assert.assertNotNull(objJsonDeserializer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        java.lang.Object obj12 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType13 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType14 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType16 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = nullifyingDeserializer0.deserializeWithType(jsonParser18, deserializationContext19, typeDeserializer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNull(objectIdReader17);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = objJsonDeserializer8.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        boolean boolean5 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.handledType();
        boolean boolean8 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = nullifyingDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = nullifyingDeserializer0.getEmptyValue(deserializationContext18);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Object obj5 = objJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objJsonDeserializer4.getObjectIdReader();
        java.lang.Object obj7 = objJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer10 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer10.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = nullifyingDeserializer10.getObjectIdReader();
        java.lang.Object obj14 = nullifyingDeserializer10.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = nullifyingDeserializer10.getObjectIdReader();
        boolean boolean16 = nullifyingDeserializer10.isCachable();
        java.util.Collection<java.lang.Object> objCollection17 = nullifyingDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = nullifyingDeserializer10.unwrappingDeserializer(nameTransformer18);
        boolean boolean20 = nullifyingDeserializer10.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = nullifyingDeserializer10.getDelegatee();
        java.lang.Object obj22 = nullifyingDeserializer10.getNullValue();
        java.lang.Class<?> wildcardClass23 = nullifyingDeserializer10.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = nullifyingDeserializer10.unwrappingDeserializer(nameTransformer24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objJsonDeserializer4.deserialize(jsonParser8, deserializationContext9, (java.lang.Object) nameTransformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(nullifyingDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(objJsonDeserializer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(objJsonDeserializer25);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getNullValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType15 = nullifyingDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer0.handledType();
        boolean boolean9 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.util.Collection<java.lang.Object> objCollection14 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType16 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass17 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = nullifyingDeserializer0.deserializeWithType(jsonParser18, deserializationContext19, typeDeserializer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean8 = nullifyingDeserializer0.isCachable();
        boolean boolean9 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = nullifyingDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection10 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer11 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer11.getEmptyValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer11.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer11.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.JavaType javaType17 = nullifyingDeserializer11.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = nullifyingDeserializer11.unwrappingDeserializer(nameTransformer18);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(nullifyingDeserializer11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(objJsonDeserializer19);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Object obj5 = objJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objJsonDeserializer4.getObjectIdReader();
        java.lang.Object obj7 = objJsonDeserializer4.getEmptyValue();
        boolean boolean8 = objJsonDeserializer4.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = objJsonDeserializer4.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = objJsonDeserializer4.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = objJsonDeserializer4.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType7 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType14 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType16 = nullifyingDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = javaType16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Object obj13 = objJsonDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = objJsonDeserializer12.getNullValue(deserializationContext14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = objJsonDeserializer12.getNullValue(deserializationContext16);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getNullValue();
        boolean boolean2 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj3 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = nullifyingDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = nullifyingDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.util.Collection<java.lang.Object> objCollection14 = objJsonDeserializer13.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = objJsonDeserializer13.unwrappingDeserializer(nameTransformer15);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        boolean boolean5 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = objJsonDeserializer7.getNullValue(deserializationContext8);
        java.lang.Object obj10 = objJsonDeserializer7.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection11 = objJsonDeserializer7.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = objJsonDeserializer13.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = objJsonDeserializer13.getEmptyValue(deserializationContext16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = objJsonDeserializer13.getEmptyValue(deserializationContext18);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = objJsonDeserializer13.unwrappingDeserializer(nameTransformer20);
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer22 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass23 = nullifyingDeserializer22.handledType();
        java.lang.Object obj24 = nullifyingDeserializer22.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection25 = nullifyingDeserializer22.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer27 = nullifyingDeserializer22.unwrappingDeserializer(nameTransformer26);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer28 = objJsonDeserializer21.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objJsonDeserializer21);
        org.junit.Assert.assertNotNull(nullifyingDeserializer22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(objCollection25);
        org.junit.Assert.assertNotNull(objJsonDeserializer27);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass2 = nullifyingDeserializer0.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = nullifyingDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer0.getNullValue(deserializationContext11);
        boolean boolean13 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue(deserializationContext14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = nullifyingDeserializer0.getEmptyValue(deserializationContext16);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = nullifyingDeserializer0.getNullValue(deserializationContext18);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        boolean boolean5 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = nullifyingDeserializer0.getDelegatee();
        boolean boolean9 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = nullifyingDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean7 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue(deserializationContext8);
        boolean boolean10 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType11 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.lang.Object obj14 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass16 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = nullifyingDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection10 = nullifyingDeserializer0.getKnownPropertyNames();
        boolean boolean11 = nullifyingDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.JavaType javaType14 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer0.getValueClass();
        java.lang.Object obj16 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer17 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = nullifyingDeserializer17.getEmptyValue(deserializationContext18);
        java.lang.Class<?> wildcardClass20 = nullifyingDeserializer17.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        java.lang.Object obj22 = nullifyingDeserializer17.getEmptyValue(deserializationContext21);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader23 = nullifyingDeserializer17.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = nullifyingDeserializer17.getDelegatee();
        java.lang.Object obj25 = nullifyingDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType26 = nullifyingDeserializer17.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader27 = nullifyingDeserializer17.getObjectIdReader();
        java.lang.Object obj28 = nullifyingDeserializer17.getEmptyValue();
        java.lang.Class<?> wildcardClass29 = nullifyingDeserializer17.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext30 = null;
        java.lang.Object obj31 = nullifyingDeserializer17.getNullValue(deserializationContext30);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer32 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(nullifyingDeserializer17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(objectIdReader23);
        org.junit.Assert.assertNull(wildcardJsonDeserializer24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(objectIdReader27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.util.Collection<java.lang.Object> objCollection14 = nullifyingDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection15 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = nullifyingDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty18 = nullifyingDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNull(objectIdReader16);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = objJsonDeserializer9.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = objJsonDeserializer9.unwrappingDeserializer(nameTransformer12);
        java.lang.Object obj14 = objJsonDeserializer9.getEmptyValue();
        java.lang.Object obj15 = objJsonDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = objJsonDeserializer9.getNullValue(deserializationContext16);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = nullifyingDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection11 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue(deserializationContext5);
        boolean boolean7 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Object obj10 = nullifyingDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.util.Collection<java.lang.Object> objCollection14 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer0.handledType();
        boolean boolean16 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader18 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(objectIdReader18);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.handledType();
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection12 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType14 = nullifyingDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection15 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = nullifyingDeserializer0.deserialize(jsonParser16, deserializationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(objCollection15);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue(deserializationContext2);
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        boolean boolean8 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj16 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection17 = nullifyingDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objCollection17);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Object obj14 = nullifyingDeserializer0.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = nullifyingDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection17 = nullifyingDeserializer0.getKnownPropertyNames();
        boolean boolean18 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj19 = nullifyingDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass20 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        java.lang.Object obj12 = nullifyingDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection14 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType15 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer18 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        java.lang.Object obj20 = nullifyingDeserializer18.getEmptyValue(deserializationContext19);
        java.lang.Class<?> wildcardClass21 = nullifyingDeserializer18.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        java.lang.Object obj23 = nullifyingDeserializer18.getEmptyValue(deserializationContext22);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader24 = nullifyingDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = nullifyingDeserializer18.getDelegatee();
        java.lang.Object obj26 = nullifyingDeserializer18.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType27 = nullifyingDeserializer18.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext28 = null;
        java.lang.Object obj29 = nullifyingDeserializer18.getNullValue(deserializationContext28);
        java.lang.Class<?> wildcardClass30 = nullifyingDeserializer18.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer32 = nullifyingDeserializer18.unwrappingDeserializer(nameTransformer31);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext33 = null;
        java.lang.Object obj34 = objJsonDeserializer32.getNullValue(deserializationContext33);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext35 = null;
        java.lang.Object obj36 = objJsonDeserializer32.getEmptyValue(deserializationContext35);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer38 = objJsonDeserializer32.unwrappingDeserializer(nameTransformer37);
        java.lang.Object obj39 = objJsonDeserializer38.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer40 = nullifyingDeserializer0.replaceDelegatee(objJsonDeserializer38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNotNull(nullifyingDeserializer18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(objectIdReader24);
        org.junit.Assert.assertNull(wildcardJsonDeserializer25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(objJsonDeserializer32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objJsonDeserializer38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection11 = nullifyingDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection12 = nullifyingDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = nullifyingDeserializer0.handledType();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getNullValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.getValueClass();
        boolean boolean8 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer12 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Object obj14 = nullifyingDeserializer12.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = nullifyingDeserializer12.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = nullifyingDeserializer12.getNullValue(deserializationContext16);
        java.util.Collection<java.lang.Object> objCollection18 = nullifyingDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = nullifyingDeserializer12.unwrappingDeserializer(nameTransformer19);
        java.lang.Object obj21 = nullifyingDeserializer12.getEmptyValue();
        java.lang.Class<?> wildcardClass22 = nullifyingDeserializer12.handledType();
        java.util.Collection<java.lang.Object> objCollection23 = nullifyingDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = nullifyingDeserializer12.getDelegatee();
        java.lang.Class<?> wildcardClass25 = nullifyingDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer26 = nullifyingDeserializer12.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = nullifyingDeserializer0.deserialize(jsonParser10, deserializationContext11, (java.lang.Object) nullifyingDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(nullifyingDeserializer12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNotNull(objJsonDeserializer20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(objCollection23);
        org.junit.Assert.assertNull(wildcardJsonDeserializer24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(wildcardJsonDeserializer26);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = objJsonDeserializer14.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = objJsonDeserializer14.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        java.lang.Object obj20 = objJsonDeserializer18.getEmptyValue(deserializationContext19);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = objJsonDeserializer18.unwrappingDeserializer(nameTransformer21);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objJsonDeserializer22);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        java.lang.Object obj15 = objJsonDeserializer14.getEmptyValue();
        boolean boolean16 = objJsonDeserializer14.isCachable();
        java.lang.Object obj17 = objJsonDeserializer14.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer18 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        java.lang.Object obj20 = nullifyingDeserializer18.getEmptyValue(deserializationContext19);
        java.lang.Class<?> wildcardClass21 = nullifyingDeserializer18.handledType();
        java.lang.Object obj22 = nullifyingDeserializer18.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType23 = nullifyingDeserializer18.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = nullifyingDeserializer18.unwrappingDeserializer(nameTransformer24);
        java.lang.Object obj26 = nullifyingDeserializer18.getEmptyValue();
        java.lang.Class<?> wildcardClass27 = nullifyingDeserializer18.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext28 = null;
        java.lang.Object obj29 = nullifyingDeserializer18.getEmptyValue(deserializationContext28);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer31 = nullifyingDeserializer18.unwrappingDeserializer(nameTransformer30);
        java.util.Collection<java.lang.Object> objCollection32 = nullifyingDeserializer18.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType33 = nullifyingDeserializer18.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext34 = null;
        java.lang.Object obj35 = nullifyingDeserializer18.getEmptyValue(deserializationContext34);
        java.util.Collection<java.lang.Object> objCollection36 = nullifyingDeserializer18.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer37 = objJsonDeserializer14.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(nullifyingDeserializer18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNotNull(objJsonDeserializer25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objJsonDeserializer31);
        org.junit.Assert.assertNull(objCollection32);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(objCollection36);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue(deserializationContext10);
        boolean boolean12 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer13 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = nullifyingDeserializer13.getEmptyValue(deserializationContext14);
        java.lang.Class<?> wildcardClass16 = nullifyingDeserializer13.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Object obj18 = nullifyingDeserializer13.getEmptyValue(deserializationContext17);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = nullifyingDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = nullifyingDeserializer13.getDelegatee();
        java.lang.Object obj21 = nullifyingDeserializer13.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType22 = nullifyingDeserializer13.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        java.lang.Object obj24 = nullifyingDeserializer13.getNullValue(deserializationContext23);
        java.lang.Class<?> wildcardClass25 = nullifyingDeserializer13.getValueClass();
        java.lang.Class<?> wildcardClass26 = nullifyingDeserializer13.getValueClass();
        java.lang.Class<?> wildcardClass27 = nullifyingDeserializer13.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer28 = nullifyingDeserializer13.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer29 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) wildcardJsonDeserializer28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nullifyingDeserializer13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(wildcardJsonDeserializer28);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = objJsonDeserializer7.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = objJsonDeserializer7.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = objJsonDeserializer7.getNullValue(deserializationContext12);
        boolean boolean14 = objJsonDeserializer7.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer17 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = nullifyingDeserializer17.getEmptyValue(deserializationContext18);
        java.lang.Class<?> wildcardClass20 = nullifyingDeserializer17.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        java.lang.Object obj22 = nullifyingDeserializer17.getEmptyValue(deserializationContext21);
        java.lang.Object obj23 = nullifyingDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType24 = nullifyingDeserializer17.getValueType();
        java.lang.Class<?> wildcardClass25 = nullifyingDeserializer17.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader26 = nullifyingDeserializer17.getObjectIdReader();
        java.lang.Object obj27 = nullifyingDeserializer17.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = nullifyingDeserializer17.unwrappingDeserializer(nameTransformer28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = objJsonDeserializer7.deserialize(jsonParser15, deserializationContext16, (java.lang.Object) nameTransformer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nullifyingDeserializer17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(objectIdReader26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objJsonDeserializer29);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue(deserializationContext2);
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = nullifyingDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue(deserializationContext8);
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection12 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Object obj14 = nullifyingDeserializer0.getNullValue(deserializationContext13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty16 = nullifyingDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer8 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer8.handledType();
        java.lang.Object obj10 = nullifyingDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer8.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JavaType javaType13 = nullifyingDeserializer8.getValueType();
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer8.handledType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = objJsonDeserializer5.deserialize(jsonParser6, deserializationContext7, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Class (by deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(nullifyingDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection6 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean8 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.JavaType javaType14 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass16 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass17 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection14 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = nullifyingDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = nullifyingDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer9 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer9.getEmptyValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer9.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Object obj14 = nullifyingDeserializer9.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = nullifyingDeserializer9.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = nullifyingDeserializer9.getDelegatee();
        java.lang.Object obj17 = nullifyingDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType18 = nullifyingDeserializer9.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        java.lang.Object obj20 = nullifyingDeserializer9.getNullValue(deserializationContext19);
        java.util.Collection<java.lang.Object> objCollection21 = nullifyingDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer23 = nullifyingDeserializer9.unwrappingDeserializer(nameTransformer22);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader24 = nullifyingDeserializer9.getObjectIdReader();
        java.lang.Object obj25 = nullifyingDeserializer9.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer26 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(nullifyingDeserializer9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(objCollection21);
        org.junit.Assert.assertNotNull(objJsonDeserializer23);
        org.junit.Assert.assertNull(objectIdReader24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer6 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer6.handledType();
        java.lang.Object obj8 = nullifyingDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer6.getNullValue(deserializationContext9);
        java.lang.Object obj11 = nullifyingDeserializer6.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer6.unwrappingDeserializer(nameTransformer12);
        boolean boolean14 = nullifyingDeserializer6.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer6.getNullValue(deserializationContext15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(nullifyingDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = nullifyingDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.Object obj14 = nullifyingDeserializer0.getEmptyValue(deserializationContext13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = nullifyingDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection18 = nullifyingDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(objCollection18);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue(deserializationContext8);
        java.lang.Object obj10 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = nullifyingDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue();
        boolean boolean8 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType12 = nullifyingDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType10 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer14 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer14.getEmptyValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = nullifyingDeserializer14.handledType();
        java.lang.Object obj18 = nullifyingDeserializer14.getNullValue();
        java.util.Collection<java.lang.Object> objCollection19 = nullifyingDeserializer14.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        java.lang.Object obj21 = nullifyingDeserializer14.getEmptyValue(deserializationContext20);
        java.util.Collection<java.lang.Object> objCollection22 = nullifyingDeserializer14.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass23 = nullifyingDeserializer14.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader24 = nullifyingDeserializer14.getObjectIdReader();
        java.lang.Class<?> wildcardClass25 = nullifyingDeserializer14.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer26 = objJsonDeserializer13.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(nullifyingDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(objCollection19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(objCollection22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(objectIdReader24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer0.getEmptyValue(deserializationContext11);
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass14 = nullifyingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = nullifyingDeserializer0.deserializeWithType(jsonParser16, deserializationContext17, typeDeserializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.util.Collection<java.lang.Object> objCollection14 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass16 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer19 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        java.lang.Object obj21 = objJsonDeserializer19.getEmptyValue(deserializationContext20);
        java.lang.Object obj22 = objJsonDeserializer19.getEmptyValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNotNull(objJsonDeserializer19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = nullifyingDeserializer0.handledType();
        java.lang.Object obj6 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.util.Collection<java.lang.Object> objCollection12 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        java.util.Collection<java.lang.Object> objCollection15 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer16);
        java.lang.Class<?> wildcardClass18 = nullifyingDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection19 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Object obj20 = nullifyingDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty22 = nullifyingDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objCollection15);
        org.junit.Assert.assertNotNull(objJsonDeserializer17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(objCollection19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType10 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.getValueClass();
        java.lang.Object obj14 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = nullifyingDeserializer0.getNullValue(deserializationContext15);
        boolean boolean17 = nullifyingDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue(deserializationContext2);
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer12 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer12.handledType();
        java.lang.Object obj14 = nullifyingDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = nullifyingDeserializer12.unwrappingDeserializer(nameTransformer15);
        java.lang.Class<?> wildcardClass17 = nullifyingDeserializer12.getValueClass();
        java.lang.Class<?> wildcardClass18 = nullifyingDeserializer12.handledType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = objJsonDeserializer9.deserialize(jsonParser10, deserializationContext11, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type java.lang.Class (by deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNotNull(nullifyingDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj12 = nullifyingDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Object obj1 = nullifyingDeserializer0.getNullValue();
        boolean boolean2 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj3 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        boolean boolean5 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.handledType();
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = nullifyingDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.handledType();
        boolean boolean11 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType14 = nullifyingDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.util.Collection<java.lang.Object> objCollection12 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = nullifyingDeserializer0.getEmptyValue(deserializationContext16);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType14 = nullifyingDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue(deserializationContext14);
        java.lang.Object obj16 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = nullifyingDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.lang.Object> objCollection18 = wildcardJsonDeserializer17.getKnownPropertyNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = objJsonDeserializer9.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = objJsonDeserializer9.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = objJsonDeserializer12.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Object obj3 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType7 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.util.Collection<java.lang.Object> objCollection14 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty17 = nullifyingDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer10);
        java.util.Collection<java.lang.Object> objCollection12 = objJsonDeserializer11.getKnownPropertyNames();
        java.lang.Object obj13 = objJsonDeserializer11.getNullValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer0.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.handledType();
        java.lang.Object obj12 = nullifyingDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Object obj8 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = nullifyingDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType8 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Object obj13 = objJsonDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = objJsonDeserializer12.getEmptyValue(deserializationContext14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = objJsonDeserializer12.getDelegatee();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = nullifyingDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection4 = nullifyingDeserializer0.getKnownPropertyNames();
        boolean boolean5 = nullifyingDeserializer0.isCachable();
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer7 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer7.handledType();
        java.lang.Object obj9 = nullifyingDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer7.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = nullifyingDeserializer7.getObjectIdReader();
        java.lang.Object obj13 = nullifyingDeserializer7.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = nullifyingDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) nullifyingDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(nullifyingDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer13 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = nullifyingDeserializer13.getEmptyValue(deserializationContext14);
        java.lang.Class<?> wildcardClass16 = nullifyingDeserializer13.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Object obj18 = nullifyingDeserializer13.getEmptyValue(deserializationContext17);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        java.lang.Object obj20 = nullifyingDeserializer13.getNullValue(deserializationContext19);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = nullifyingDeserializer13.getObjectIdReader();
        java.lang.Class<?> wildcardClass22 = nullifyingDeserializer13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = nullifyingDeserializer0.deserialize(jsonParser11, deserializationContext12, (java.lang.Object) nullifyingDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer (by deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(nullifyingDeserializer13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(objectIdReader21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = nullifyingDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType13 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(objectIdReader14);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue(deserializationContext10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = nullifyingDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        boolean boolean14 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objectIdReader17);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = nullifyingDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType13 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = objJsonDeserializer15.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objectIdReader16);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.lang.Object obj14 = objJsonDeserializer13.getNullValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType8 = nullifyingDeserializer0.getValueType();
        java.lang.Object obj9 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj4 = nullifyingDeserializer0.getEmptyValue();
        java.lang.Object obj5 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = nullifyingDeserializer0.getNullValue(deserializationContext14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = nullifyingDeserializer0.deserializeWithType(jsonParser16, deserializationContext17, typeDeserializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj7 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = nullifyingDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = nullifyingDeserializer0.getValueClass();
        java.lang.Object obj11 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = nullifyingDeserializer0.deserialize(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = nullifyingDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer17 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        java.lang.Object obj19 = nullifyingDeserializer17.getEmptyValue(deserializationContext18);
        java.lang.Object obj20 = nullifyingDeserializer17.getNullValue();
        java.lang.Object obj21 = nullifyingDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType22 = nullifyingDeserializer17.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        java.lang.Object obj24 = nullifyingDeserializer17.getEmptyValue(deserializationContext23);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer26 = nullifyingDeserializer17.unwrappingDeserializer(nameTransformer25);
        java.util.Collection<java.lang.Object> objCollection27 = objJsonDeserializer26.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = objJsonDeserializer14.deserialize(jsonParser15, deserializationContext16, (java.lang.Object) objCollection27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNotNull(nullifyingDeserializer17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objJsonDeserializer26);
        org.junit.Assert.assertNull(objCollection27);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer12);
        java.util.Collection<java.lang.Object> objCollection14 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass15 = nullifyingDeserializer0.handledType();
        java.lang.Object obj16 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Object obj18 = nullifyingDeserializer0.getEmptyValue(deserializationContext17);
        java.lang.Object obj19 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass21 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        java.lang.Object obj23 = nullifyingDeserializer0.getEmptyValue(deserializationContext22);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer24);
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(objectIdReader20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objJsonDeserializer25);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = nullifyingDeserializer0.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        java.lang.Object obj15 = nullifyingDeserializer0.getEmptyValue(deserializationContext14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        java.lang.Object obj17 = nullifyingDeserializer0.getEmptyValue(deserializationContext16);
        java.lang.Object obj18 = nullifyingDeserializer0.getNullValue();
        java.lang.Object obj19 = nullifyingDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = nullifyingDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = nullifyingDeserializer0.getDelegatee();
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = nullifyingDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = nullifyingDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass13 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = nullifyingDeserializer0.getValueClass();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = nullifyingDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection5 = nullifyingDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = nullifyingDeserializer0.getEmptyValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = nullifyingDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = nullifyingDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = wildcardJsonDeserializer10.getNullValue(deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = nullifyingDeserializer0.handledType();
        java.lang.Object obj2 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = nullifyingDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = nullifyingDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = nullifyingDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = nullifyingDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = nullifyingDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = nullifyingDeserializer0.handledType();
        boolean boolean6 = nullifyingDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.handledType();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = nullifyingDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = nullifyingDeserializer0.getEmptyValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = nullifyingDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = nullifyingDeserializer0.getEmptyValue(deserializationContext4);
        java.lang.Object obj6 = nullifyingDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = nullifyingDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = nullifyingDeserializer0.getValueClass();
        java.lang.Object obj10 = nullifyingDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = nullifyingDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass12 = nullifyingDeserializer0.handledType();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

