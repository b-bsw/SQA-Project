package com.fasterxml.jackson.databind.deser.std;

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
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection6 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
// flaky "1) test3501(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer0._elementDeserializer;
        boolean boolean5 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = stringArrayDeserializer6.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
// flaky "2) test3502(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer3.getObjectIdReader();
        java.lang.String[] strArray8 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer3.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer3.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = stringArrayDeserializer3.getValueClass();
        boolean boolean12 = stringArrayDeserializer3.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType13 = stringArrayDeserializer3.getValueType();
        java.util.Collection<java.lang.Object> objCollection14 = stringArrayDeserializer3.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(objCollection14);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        boolean boolean11 = stringArrayDeserializer10.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer10.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer13.getValueClass();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = stringArrayDeserializer5.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer5.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        boolean boolean11 = strArrayJsonDeserializer10.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = stringArrayDeserializer12.getObjectIdReader();
        boolean boolean14 = stringArrayDeserializer12.isCachable();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer12.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer17 = stringArrayDeserializer12.unwrappingDeserializer(nameTransformer16);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer20 = stringArrayDeserializer19._elementDeserializer;
        stringArrayDeserializer5._elementDeserializer = strJsonDeserializer20;
        java.lang.Class<?> wildcardClass22 = stringArrayDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer24 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer23);
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNotNull(stringArrayDeserializer8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer17);
        org.junit.Assert.assertNotNull(strJsonDeserializer20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer24);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        java.lang.Class<?> wildcardClass1 = stringArrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass2 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        java.lang.String[] strArray11 = stringArrayDeserializer8.getEmptyValue();
        java.lang.String[] strArray12 = stringArrayDeserializer8.getEmptyValue();
        java.lang.String[] strArray13 = stringArrayDeserializer8.getNullValue();
        java.lang.String[] strArray14 = stringArrayDeserializer8.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType15 = stringArrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType17 = stringArrayDeserializer8.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer18 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer20 = stringArrayDeserializer18.unwrappingDeserializer(nameTransformer19);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer18);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer22 = stringArrayDeserializer18._elementDeserializer;
        boolean boolean23 = stringArrayDeserializer18.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader24 = stringArrayDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader25 = stringArrayDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = stringArrayDeserializer18._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer26;
        java.lang.String[] strArray28 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer31 = stringArrayDeserializer29.unwrappingDeserializer(nameTransformer30);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer29);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = stringArrayDeserializer29._elementDeserializer;
        boolean boolean34 = stringArrayDeserializer29.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer35 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer29);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer36 = stringArrayDeserializer35._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer37 = stringArrayDeserializer35._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer37;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer37;
        com.fasterxml.jackson.databind.JavaType javaType40 = stringArrayDeserializer4.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer41 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer42 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer43 = stringArrayDeserializer41.unwrappingDeserializer(nameTransformer42);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer44 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer41);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer45 = stringArrayDeserializer41._elementDeserializer;
        boolean boolean46 = stringArrayDeserializer41.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer47 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer41);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer49 = stringArrayDeserializer41.unwrappingDeserializer(nameTransformer48);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer50 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer41);
        java.lang.Class<?> wildcardClass51 = stringArrayDeserializer50.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer52 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer53 = stringArrayDeserializer50.unwrappingDeserializer(nameTransformer52);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer54 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        java.lang.Class<?> wildcardClass55 = stringArrayDeserializer54.getValueClass();
        java.lang.Class<?> wildcardClass56 = stringArrayDeserializer54.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer57 = stringArrayDeserializer54.getDelegatee();
        java.lang.String[] strArray58 = stringArrayDeserializer54.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer59 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer60 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer61 = stringArrayDeserializer59.unwrappingDeserializer(nameTransformer60);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer62 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer59);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer63 = stringArrayDeserializer62.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer64 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer65 = stringArrayDeserializer62.unwrappingDeserializer(nameTransformer64);
        boolean boolean66 = stringArrayDeserializer62.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer67 = stringArrayDeserializer62._elementDeserializer;
        stringArrayDeserializer54._elementDeserializer = strJsonDeserializer67;
        stringArrayDeserializer50._elementDeserializer = strJsonDeserializer67;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer67;
        java.lang.Class<?> wildcardClass71 = stringArrayDeserializer4.handledType();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(stringArrayDeserializer5);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNotNull(stringArrayDeserializer18);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer20);
// flaky "3) test3506(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(objectIdReader24);
        org.junit.Assert.assertNull(objectIdReader25);
// flaky "1) test3506(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer26);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(stringArrayDeserializer29);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer31);
// flaky "1) test3506(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strJsonDeserializer36);
        org.junit.Assert.assertNotNull(strJsonDeserializer37);
        org.junit.Assert.assertNull(javaType40);
        org.junit.Assert.assertNotNull(stringArrayDeserializer41);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer43);
// flaky "1) test3506(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer49);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer53);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNull(wildcardJsonDeserializer57);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNotNull(stringArrayDeserializer59);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer61);
        org.junit.Assert.assertNull(wildcardJsonDeserializer63);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strJsonDeserializer67);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer3.getObjectIdReader();
        java.lang.String[] strArray8 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = stringArrayDeserializer3.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer3.getKnownPropertyNames();
        java.lang.String[] strArray11 = stringArrayDeserializer3.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = stringArrayDeserializer3.deserialize(jsonParser12, deserializationContext13, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray7 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray8 = stringArrayDeserializer3.getNullValue();
        java.lang.String[] strArray9 = stringArrayDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer13._elementDeserializer;
        boolean boolean18 = stringArrayDeserializer13.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = stringArrayDeserializer13.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer21 = stringArrayDeserializer13._elementDeserializer;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer21;
        java.lang.String[] strArray23 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer24 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer26 = stringArrayDeserializer24.unwrappingDeserializer(nameTransformer25);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer28 = stringArrayDeserializer24._elementDeserializer;
        boolean boolean29 = stringArrayDeserializer24.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer24);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer31 = stringArrayDeserializer30._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = stringArrayDeserializer30._elementDeserializer;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer32;
        java.lang.Class<?> wildcardClass34 = stringArrayDeserializer3.handledType();
        boolean boolean35 = stringArrayDeserializer3.isCachable();
        java.util.Collection<java.lang.Object> objCollection36 = stringArrayDeserializer3.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(stringArrayDeserializer13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
// flaky "4) test3508(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(objectIdReader20);
// flaky "2) test3508(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(stringArrayDeserializer24);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer26);
// flaky "2) test3508(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strJsonDeserializer31);
        org.junit.Assert.assertNotNull(strJsonDeserializer32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(objCollection36);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer0._elementDeserializer;
        boolean boolean5 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = stringArrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer13 = stringArrayDeserializer11.unwrappingDeserializer(nameTransformer12);
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = stringArrayDeserializer11.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer19 = stringArrayDeserializer17.unwrappingDeserializer(nameTransformer18);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer20 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer22 = stringArrayDeserializer20.unwrappingDeserializer(nameTransformer21);
        java.lang.String[] strArray23 = stringArrayDeserializer20.getEmptyValue();
        java.lang.String[] strArray24 = stringArrayDeserializer20.getEmptyValue();
        java.lang.Class<?> wildcardClass25 = stringArrayDeserializer20.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer26 = null;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer26;
        java.util.Collection<java.lang.Object> objCollection28 = stringArrayDeserializer20.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer31 = stringArrayDeserializer29.unwrappingDeserializer(nameTransformer30);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer32 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer29);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer33 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer34 = stringArrayDeserializer32.unwrappingDeserializer(nameTransformer33);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer35 = stringArrayDeserializer32._elementDeserializer;
        stringArrayDeserializer20._elementDeserializer = strJsonDeserializer35;
        stringArrayDeserializer11._elementDeserializer = strJsonDeserializer35;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer35;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader39 = stringArrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader40 = stringArrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
// flaky "5) test3509(com.fasterxml.jackson.databind.deser.std.RegressionTest7)":         org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(stringArrayDeserializer8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objectIdReader15);
        org.junit.Assert.assertNotNull(stringArrayDeserializer17);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer19);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(objCollection28);
        org.junit.Assert.assertNotNull(stringArrayDeserializer29);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer31);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer34);
        org.junit.Assert.assertNotNull(strJsonDeserializer35);
        org.junit.Assert.assertNull(objectIdReader39);
        org.junit.Assert.assertNull(objectIdReader40);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = stringArrayDeserializer5.getDelegatee();
        java.lang.String[] strArray7 = stringArrayDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer5.getValueType();
        java.lang.String[] strArray9 = stringArrayDeserializer5.getNullValue();
        java.lang.String[] strArray10 = stringArrayDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = stringArrayDeserializer5.getValueType();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer5.getValueClass();
        java.lang.String[] strArray15 = stringArrayDeserializer5.getNullValue();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = strArrayJsonDeserializer6.unwrappingDeserializer(nameTransformer7);
        java.lang.String[] strArray9 = strArrayJsonDeserializer6.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = strArrayJsonDeserializer6.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = strArrayJsonDeserializer6.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        boolean boolean3 = strArrayJsonDeserializer2.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer4.getObjectIdReader();
        boolean boolean6 = stringArrayDeserializer4.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer7 = stringArrayDeserializer4._elementDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer4.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer13 = strArrayJsonDeserializer11.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strJsonDeserializer7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer13);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        boolean boolean3 = strArrayJsonDeserializer2.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = stringArrayDeserializer4.getObjectIdReader();
        boolean boolean6 = stringArrayDeserializer4.isCachable();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer4.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer9 = stringArrayDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer9);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = stringArrayDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = stringArrayDeserializer10._deserializeCustom(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = stringArrayDeserializer0.createContextual(deserializationContext8, beanProperty9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer7.getValueType();
        boolean boolean9 = stringArrayDeserializer7.isCachable();
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer7.getValueClass();
        java.lang.String[] strArray11 = stringArrayDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer7);
        java.lang.String[] strArray13 = stringArrayDeserializer12.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = stringArrayDeserializer12.createContextual(deserializationContext14, beanProperty15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer8._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer13 = stringArrayDeserializer11.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer14 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer16 = stringArrayDeserializer14.unwrappingDeserializer(nameTransformer15);
        java.lang.String[] strArray17 = stringArrayDeserializer14.getEmptyValue();
        java.lang.String[] strArray18 = stringArrayDeserializer14.getEmptyValue();
        java.lang.Class<?> wildcardClass19 = stringArrayDeserializer14.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer20 = null;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer20;
        java.util.Collection<java.lang.Object> objCollection22 = stringArrayDeserializer14.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer25 = stringArrayDeserializer23.unwrappingDeserializer(nameTransformer24);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer23);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer28 = stringArrayDeserializer26.unwrappingDeserializer(nameTransformer27);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer29 = stringArrayDeserializer26._elementDeserializer;
        stringArrayDeserializer14._elementDeserializer = strJsonDeserializer29;
        boolean boolean31 = stringArrayDeserializer14.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer32 = stringArrayDeserializer14.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer33 = stringArrayDeserializer14._elementDeserializer;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer33;
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNotNull(stringArrayDeserializer11);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(objCollection22);
        org.junit.Assert.assertNotNull(stringArrayDeserializer23);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer25);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer28);
        org.junit.Assert.assertNotNull(strJsonDeserializer29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer32);
        org.junit.Assert.assertNotNull(strJsonDeserializer33);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = strArrayJsonDeserializer2.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection4 = strArrayJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer7);
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = strArrayJsonDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer10 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = strArrayJsonDeserializer8.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        boolean boolean16 = strArrayJsonDeserializer15.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer17 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer15);
        java.lang.Class<?> wildcardClass18 = stringArrayDeserializer17.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer20 = stringArrayDeserializer17.unwrappingDeserializer(nameTransformer19);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer22 = stringArrayDeserializer17.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.JavaType javaType23 = stringArrayDeserializer17.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer24 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
        java.lang.Class<?> wildcardClass25 = stringArrayDeserializer17.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer26 = strArrayJsonDeserializer8.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNotNull(stringArrayDeserializer13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer20);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass4 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = stringArrayDeserializer5.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType7 = stringArrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = stringArrayDeserializer5.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = stringArrayDeserializer5.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = stringArrayDeserializer5.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = stringArrayDeserializer5.createContextual(deserializationContext11, beanProperty12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        boolean boolean1 = stringArrayDeserializer0.isCachable();
        java.lang.String[] strArray2 = stringArrayDeserializer0.getNullValue();
        java.lang.String[] strArray3 = stringArrayDeserializer0.getNullValue();
        java.lang.String[] strArray4 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = stringArrayDeserializer5.deserialize(jsonParser6, deserializationContext7, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.util.Collection<java.lang.Object> objCollection8 = stringArrayDeserializer7.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer6 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer11 = stringArrayDeserializer9.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer14 = stringArrayDeserializer12.unwrappingDeserializer(nameTransformer13);
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = stringArrayDeserializer12.getObjectIdReader();
        java.lang.String[] strArray17 = stringArrayDeserializer12.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = stringArrayDeserializer12.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection19 = stringArrayDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer20 = null;
        stringArrayDeserializer12._elementDeserializer = strJsonDeserializer20;
        com.fasterxml.jackson.databind.JavaType javaType22 = stringArrayDeserializer12.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer25 = stringArrayDeserializer23.unwrappingDeserializer(nameTransformer24);
        boolean boolean26 = strArrayJsonDeserializer25.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer27 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer25);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer28 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer27);
        java.lang.String[] strArray29 = stringArrayDeserializer28.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer31 = stringArrayDeserializer28.unwrappingDeserializer(nameTransformer30);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer32 = stringArrayDeserializer28._elementDeserializer;
        stringArrayDeserializer12._elementDeserializer = strJsonDeserializer32;
        stringArrayDeserializer3._elementDeserializer = strJsonDeserializer32;
        java.lang.Class<?> wildcardClass35 = strJsonDeserializer32.getClass();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
        org.junit.Assert.assertNotNull(stringArrayDeserializer9);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer11);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(wildcardJsonDeserializer18);
        org.junit.Assert.assertNull(objCollection19);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNotNull(stringArrayDeserializer23);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer31);
        org.junit.Assert.assertNotNull(strJsonDeserializer32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.lang.String[] strArray9 = stringArrayDeserializer8.getNullValue();
        java.lang.String[] strArray10 = stringArrayDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = stringArrayDeserializer8.getObjectIdReader();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty5 = stringArrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer0._elementDeserializer;
        boolean boolean5 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer6 = stringArrayDeserializer0._elementDeserializer;
        java.util.Collection<java.lang.Object> objCollection7 = stringArrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer8 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer9 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        java.lang.String[] strArray10 = stringArrayDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(strJsonDeserializer8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer7 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = stringArrayDeserializer3.getDelegatee();
        boolean boolean9 = stringArrayDeserializer3.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = stringArrayDeserializer3.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer14 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer13);
        java.lang.String[] strArray15 = stringArrayDeserializer3.getNullValue();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer14);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray7 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray8 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = stringArrayDeserializer3.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer3.getKnownPropertyNames();
        boolean boolean11 = stringArrayDeserializer3.isCachable();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer3.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = stringArrayDeserializer3.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        boolean boolean6 = strArrayJsonDeserializer5.isCachable();
        boolean boolean7 = strArrayJsonDeserializer5.isCachable();
        java.lang.String[] strArray8 = strArrayJsonDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = strArrayJsonDeserializer5.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = strArrayJsonDeserializer10.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = stringArrayDeserializer12.getObjectIdReader();
        java.lang.String[] strArray14 = stringArrayDeserializer12.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty16 = stringArrayDeserializer12.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        java.util.Collection<java.lang.Object> objCollection12 = stringArrayDeserializer3.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer3.getValueClass();
        java.lang.String[] strArray14 = stringArrayDeserializer3.getNullValue();
        java.lang.String[] strArray15 = stringArrayDeserializer3.getNullValue();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer0._elementDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray6 = stringArrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer8 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer0._elementDeserializer;
        java.lang.Class<?> wildcardClass10 = stringArrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer8);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer8._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer8._elementDeserializer;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        java.lang.Class<?> wildcardClass13 = stringArrayDeserializer12.getValueClass();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer12.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer15 = stringArrayDeserializer12._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer16 = stringArrayDeserializer12._elementDeserializer;
        java.lang.String[] strArray17 = stringArrayDeserializer12.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer12.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer19 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer12);
        java.lang.String[] strArray20 = stringArrayDeserializer19.getEmptyValue();
        java.lang.Class<?> wildcardClass21 = stringArrayDeserializer19.getValueClass();
        java.lang.String[] strArray22 = stringArrayDeserializer19.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer23 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer25 = stringArrayDeserializer23.unwrappingDeserializer(nameTransformer24);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer23);
        java.lang.String[] strArray27 = stringArrayDeserializer23.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType28 = stringArrayDeserializer23.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader29 = stringArrayDeserializer23.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer30 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer32 = stringArrayDeserializer30.unwrappingDeserializer(nameTransformer31);
        boolean boolean33 = strArrayJsonDeserializer32.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer34 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer32);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer35 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer34);
        com.fasterxml.jackson.databind.JavaType javaType36 = stringArrayDeserializer35.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer37 = stringArrayDeserializer35._elementDeserializer;
        stringArrayDeserializer23._elementDeserializer = strJsonDeserializer37;
        stringArrayDeserializer19._elementDeserializer = strJsonDeserializer37;
        stringArrayDeserializer8._elementDeserializer = strJsonDeserializer37;
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(strJsonDeserializer15);
        org.junit.Assert.assertNull(strJsonDeserializer16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(stringArrayDeserializer23);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer25);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(objectIdReader29);
        org.junit.Assert.assertNotNull(stringArrayDeserializer30);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNotNull(strJsonDeserializer37);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer1 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer3 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = strArrayJsonDeserializer3.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = objectIdReader4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer9);
        java.lang.String[] strArray11 = strArrayJsonDeserializer10.getNullValue();
        java.lang.String[] strArray12 = strArrayJsonDeserializer10.getNullValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        java.lang.String[] strArray17 = stringArrayDeserializer13.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType18 = stringArrayDeserializer13.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer20 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer19);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer22 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer21);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer24 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer23);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer25 = strArrayJsonDeserializer10.replaceDelegatee(strArrayJsonDeserializer24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(stringArrayDeserializer13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer20);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer22);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer24);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        java.lang.Class<?> wildcardClass7 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer9 = stringArrayDeserializer8._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer10 = stringArrayDeserializer8._elementDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer8._elementDeserializer;
        boolean boolean12 = stringArrayDeserializer8.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stringArrayDeserializer8.deserializeWithType(jsonParser13, deserializationContext14, typeDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strJsonDeserializer9);
        org.junit.Assert.assertNotNull(strJsonDeserializer10);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray7 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray8 = stringArrayDeserializer3.getNullValue();
        java.lang.String[] strArray9 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray10 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer12 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer11);
        java.lang.String[] strArray13 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = stringArrayDeserializer3.getDelegatee();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = stringArrayDeserializer3.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer3.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType8 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer11 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer3);
        com.fasterxml.jackson.databind.JavaType javaType12 = stringArrayDeserializer3.getValueType();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer18 = stringArrayDeserializer16.unwrappingDeserializer(nameTransformer17);
        java.lang.Class<?> wildcardClass19 = stringArrayDeserializer16.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = stringArrayDeserializer16.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        java.lang.Class<?> wildcardClass22 = stringArrayDeserializer16.handledType();
        java.lang.Class<?> wildcardClass23 = stringArrayDeserializer16.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader24 = stringArrayDeserializer16.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader25 = stringArrayDeserializer16.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer26 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer16);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer27 = stringArrayDeserializer26._elementDeserializer;
        java.lang.String[] strArray28 = stringArrayDeserializer26.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader29 = stringArrayDeserializer26.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer30 = stringArrayDeserializer3.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNotNull(stringArrayDeserializer13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(objectIdReader20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(objectIdReader24);
        org.junit.Assert.assertNull(objectIdReader25);
        org.junit.Assert.assertNotNull(strJsonDeserializer27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNull(objectIdReader29);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer4 = stringArrayDeserializer0._elementDeserializer;
        boolean boolean5 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer6 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = stringArrayDeserializer6.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        boolean boolean11 = strArrayJsonDeserializer10.isCachable();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer12 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer(strArrayJsonDeserializer10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = stringArrayDeserializer12.getObjectIdReader();
        java.lang.Class<?> wildcardClass14 = stringArrayDeserializer12.getValueClass();
        java.lang.Class<?> wildcardClass15 = stringArrayDeserializer12.getValueClass();
        boolean boolean16 = stringArrayDeserializer12.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer17 = stringArrayDeserializer12._elementDeserializer;
        stringArrayDeserializer6._elementDeserializer = strJsonDeserializer17;
        com.fasterxml.jackson.databind.JavaType javaType19 = stringArrayDeserializer6.getValueType();
        java.util.Collection<java.lang.Object> objCollection20 = stringArrayDeserializer6.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer21 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer6);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer22 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer24 = stringArrayDeserializer22.unwrappingDeserializer(nameTransformer23);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer25 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer22);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer27 = stringArrayDeserializer25.unwrappingDeserializer(nameTransformer26);
        java.lang.String[] strArray28 = stringArrayDeserializer25.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer29 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer25);
        com.fasterxml.jackson.databind.JavaType javaType30 = stringArrayDeserializer29.getValueType();
        boolean boolean31 = stringArrayDeserializer29.isCachable();
        java.lang.Class<?> wildcardClass32 = stringArrayDeserializer29.getValueClass();
        java.lang.String[] strArray33 = stringArrayDeserializer29.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer34 = stringArrayDeserializer29.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer35 = stringArrayDeserializer21.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(stringArrayDeserializer8);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strJsonDeserializer17);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(objCollection20);
        org.junit.Assert.assertNotNull(stringArrayDeserializer22);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer24);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNull(javaType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(strArray33);
        org.junit.Assert.assertNull(wildcardJsonDeserializer34);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer3 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer0);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer5 = stringArrayDeserializer3.unwrappingDeserializer(nameTransformer4);
        java.lang.String[] strArray6 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray7 = stringArrayDeserializer3.getEmptyValue();
        java.lang.String[] strArray8 = stringArrayDeserializer3.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = stringArrayDeserializer3.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection10 = stringArrayDeserializer3.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = stringArrayDeserializer3.getDelegatee();
        java.lang.Class<?> wildcardClass12 = stringArrayDeserializer3.getValueClass();
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer2 = stringArrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.String[] strArray3 = stringArrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer7 = stringArrayDeserializer5.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer8 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer10 = stringArrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer11 = stringArrayDeserializer8._elementDeserializer;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer11;
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer13 = com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer.instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer15 = stringArrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer stringArrayDeserializer16 = new com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]>) stringArrayDeserializer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String[]> strArrayJsonDeserializer18 = stringArrayDeserializer16.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> strJsonDeserializer19 = stringArrayDeserializer16._elementDeserializer;
        stringArrayDeserializer4._elementDeserializer = strJsonDeserializer19;
        stringArrayDeserializer0._elementDeserializer = strJsonDeserializer19;
        java.lang.Class<?> wildcardClass22 = stringArrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType23 = stringArrayDeserializer0.getValueType();
        java.lang.String[] strArray24 = stringArrayDeserializer0.getEmptyValue();
        boolean boolean25 = stringArrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        java.lang.String[] strArray28 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray29 = stringArrayDeserializer0.deserialize(jsonParser26, deserializationContext27, strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type [Ljava.lang.String; (by deserializer of type com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringArrayDeserializer0);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(stringArrayDeserializer4);
        org.junit.Assert.assertNotNull(stringArrayDeserializer5);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer7);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer10);
        org.junit.Assert.assertNotNull(strJsonDeserializer11);
        org.junit.Assert.assertNotNull(stringArrayDeserializer13);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer15);
        org.junit.Assert.assertNotNull(strArrayJsonDeserializer18);
        org.junit.Assert.assertNotNull(strJsonDeserializer19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
    }
}
