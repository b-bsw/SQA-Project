package com.fasterxml.jackson.databind.deser.std;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = untypedObjectDeserializer2.mapArray(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer5 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType3, javaType4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = untypedObjectDeserializer2.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = untypedObjectDeserializer2.mapArray(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = untypedObjectDeserializer2.mapArrayToArray(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = untypedObjectDeserializer2.mapObject(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = vanilla0.mapObject(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = vanilla0.mapArray(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = vanilla0.mapObject(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = vanilla0.mapArrayToArray(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = vanilla0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = untypedObjectDeserializer2.mapObject(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = untypedObjectDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = untypedObjectDeserializer2.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objJsonDeserializer4.getEmptyValue(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer0.resolve(deserializationContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = untypedObjectDeserializer2.mapArrayToArray(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = untypedObjectDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer2.mapArray(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer5 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objJsonDeserializer4.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = vanilla0.mapArray(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = untypedObjectDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object[] objArray0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.NO_OBJECTS;
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertArrayEquals(objArray0, new java.lang.Object[] {});
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = vanilla0.mapArrayToArray(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = wildcardJsonDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = wildcardJsonDeserializer5.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer0._findCustomDeser(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "1) test028(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer2.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = untypedObjectDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._findCustomDeser(deserializationContext6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = vanilla0.deserialize(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer2.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._findCustomDeser(deserializationContext1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._listType = javaType6;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer2.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objJsonDeserializer7.getDelegatee();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objJsonDeserializer5.getNullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = untypedObjectDeserializer2.mapArrayToArray(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = objJsonDeserializer2.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objJsonDeserializer2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer2.mapArray(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._findCustomDeser(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = untypedObjectDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = untypedObjectDeserializer2.mapArray(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = untypedObjectDeserializer2.mapArray(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = untypedObjectDeserializer0.mapArray(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objJsonDeserializer2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = untypedObjectDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = untypedObjectDeserializer0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = objJsonDeserializer8.getNullValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer2.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = untypedObjectDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = untypedObjectDeserializer0.mapObject(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = untypedObjectDeserializer2.mapArrayToArray(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.mapObject(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = wildcardJsonDeserializer5.getObjectIdReader();
        boolean boolean7 = wildcardJsonDeserializer5.isCachable();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.mapArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = objJsonDeserializer4.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = objJsonDeserializer4.getClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
// flaky "2) test057(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer7._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer7.getEmptyValue(deserializationContext11);
        untypedObjectDeserializer0._listDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = untypedObjectDeserializer0._findCustomDeser(deserializationContext14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
// flaky "3) test059(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = untypedObjectDeserializer2.mapArray(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._mapType;
        java.util.Collection<java.lang.Object> objCollection9 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = untypedObjectDeserializer2.mapArray(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.lang.Object obj5 = untypedObjectDeserializer2.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer2.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer2.createContextual(deserializationContext11, beanProperty12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = untypedObjectDeserializer2.mapObject(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = untypedObjectDeserializer2.deserializeWithType(jsonParser12, deserializationContext13, typeDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer2.mapArray(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = untypedObjectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = untypedObjectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(objectIdReader2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla0.mapArray(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla0.mapObject(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = untypedObjectDeserializer2.mapArrayToArray(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = untypedObjectDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = untypedObjectDeserializer10.mapArrayToArray(jsonParser17, deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean4 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = vanilla0.mapArrayToArray(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._findCustomDeser(deserializationContext2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = untypedObjectDeserializer2.mapArrayToArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        boolean boolean5 = objJsonDeserializer4.isCachable();
        java.lang.Object obj6 = objJsonDeserializer4.getEmptyValue();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = untypedObjectDeserializer0._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection2 = untypedObjectDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = objCollection2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = untypedObjectDeserializer2.mapArrayToArray(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = untypedObjectDeserializer2.mapArray(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = untypedObjectDeserializer2.createContextual(deserializationContext6, beanProperty7);
        java.lang.Object obj9 = wildcardJsonDeserializer8.getNullValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer2.mapObject(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        java.lang.Object obj11 = untypedObjectDeserializer2.getNullValue();
        boolean boolean12 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer2.mapArray(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = untypedObjectDeserializer2.mapArrayToArray(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._listDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objJsonDeserializer10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = untypedObjectDeserializer0.deserialize(jsonParser1, deserializationContext2, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer0.getClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
// flaky "4) test095(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = wildcardJsonDeserializer7.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objJsonDeserializer5.getEmptyValue(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = untypedObjectDeserializer2.mapArrayToArray(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = untypedObjectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "5) test100(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._listType = javaType6;
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.mapObject(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = untypedObjectDeserializer0.mapArray(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.mapArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2.getValueType();
        java.lang.Object obj10 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = untypedObjectDeserializer2.mapObject(jsonParser17, deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._findCustomDeser(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer8 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType6, javaType7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = untypedObjectDeserializer8.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer8.createContextual(deserializationContext11, beanProperty12);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = untypedObjectDeserializer2.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) wildcardJsonDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = objJsonDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.mapObject(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = untypedObjectDeserializer2.mapArrayToArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer2.createContextual(deserializationContext11, beanProperty12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = untypedObjectDeserializer2.createContextual(deserializationContext14, beanProperty15);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        untypedObjectDeserializer2._listType = javaType8;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        untypedObjectDeserializer2._mapType = javaType10;
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._findCustomDeser(deserializationContext10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = untypedObjectDeserializer2.mapArrayToArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = objJsonDeserializer4.getClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
// flaky "6) test117(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        untypedObjectDeserializer2._listDeserializer = objJsonDeserializer11;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer0._listType;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = untypedObjectDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer12.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = objJsonDeserializer14.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0.unwrappingDeserializer(nameTransformer3);
        java.util.Collection<java.lang.Object> objCollection5 = objJsonDeserializer4.getKnownPropertyNames();
        java.lang.Object obj6 = objJsonDeserializer4.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = objJsonDeserializer4.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
// flaky "7) test122(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._listType;
        java.util.Collection<java.lang.Object> objCollection9 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        untypedObjectDeserializer2._listType = javaType10;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = untypedObjectDeserializer2.createContextual(deserializationContext6, beanProperty7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = wildcardJsonDeserializer8.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        java.util.Collection<java.lang.Object> objCollection10 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = untypedObjectDeserializer2.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        java.lang.Object obj9 = untypedObjectDeserializer2.getNullValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        java.lang.Object obj11 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = untypedObjectDeserializer2.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objectIdReader12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = untypedObjectDeserializer2.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonDeserializer9.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        untypedObjectDeserializer2._listType = javaType4;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer2.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer4.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = untypedObjectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer0.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "8) test133(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._findCustomDeser(deserializationContext10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = untypedObjectDeserializer2.mapArrayToArray(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer7._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer7.getEmptyValue(deserializationContext11);
        untypedObjectDeserializer0._listDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = untypedObjectDeserializer0.mapObject(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = objCollection17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer2.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = untypedObjectDeserializer0.mapArrayToArray(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = untypedObjectDeserializer2.mapArrayToArray(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._listType = javaType6;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = objJsonDeserializer10.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = vanilla0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType18 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(javaType18);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = vanilla0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = vanilla0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = wildcardJsonDeserializer5.getNullValue(deserializationContext6);
        java.lang.Object obj8 = wildcardJsonDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = wildcardJsonDeserializer5.getNullValue(deserializationContext9);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        boolean boolean3 = untypedObjectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer0._findCustomDeser(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
// flaky "9) test150(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNull(objJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        java.util.Collection<java.lang.Object> objCollection1 = vanilla0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla0.mapObject(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        java.util.Collection<java.lang.Object> objCollection1 = vanilla0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla0.mapArray(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = untypedObjectDeserializer0._listDeserializer;
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.handledType();
        org.junit.Assert.assertNull(objJsonDeserializer1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = untypedObjectDeserializer2.mapArrayToArray(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = untypedObjectDeserializer2.createContextual(deserializationContext10, beanProperty11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer2._findCustomDeser(deserializationContext13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        java.util.Collection<java.lang.Object> objCollection1 = vanilla0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla0.deserializeWithType(jsonParser2, deserializationContext3, typeDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = vanilla0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla0.mapArray(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = objJsonDeserializer9.unwrappingDeserializer(nameTransformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType18 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = untypedObjectDeserializer2.mapObject(jsonParser19, deserializationContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(javaType18);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = vanilla0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._mapType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean18 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        java.lang.Object obj20 = untypedObjectDeserializer2.getNullValue(deserializationContext19);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        java.lang.Object obj11 = untypedObjectDeserializer2.getNullValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        untypedObjectDeserializer2._listType = javaType10;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = vanilla0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = vanilla0.mapArrayToArray(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = untypedObjectDeserializer2.createContextual(deserializationContext9, beanProperty10);
        java.lang.Object obj12 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        java.util.Collection<java.lang.Object> objCollection1 = vanilla0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = vanilla0.mapArrayToArray(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        java.util.Collection<java.lang.Object> objCollection1 = vanilla0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser2 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = vanilla0.deserialize(jsonParser2, deserializationContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objCollection1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        untypedObjectDeserializer2._mapType = javaType3;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer7._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer7._mapType = javaType11;
        java.util.Collection<java.lang.Object> objCollection13 = untypedObjectDeserializer7.getKnownPropertyNames();
        boolean boolean14 = untypedObjectDeserializer7.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = untypedObjectDeserializer7.createContextual(deserializationContext15, beanProperty16);
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        untypedObjectDeserializer7._listType = javaType18;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = untypedObjectDeserializer2.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer17);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._listType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = untypedObjectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = untypedObjectDeserializer0.mapArrayToArray(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        java.lang.Object obj10 = untypedObjectDeserializer2.getNullValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer7._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer7.getEmptyValue(deserializationContext11);
        untypedObjectDeserializer0._listDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.databind.JavaType javaType14 = untypedObjectDeserializer7.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer7.resolve(deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = untypedObjectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer0.resolve(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "10) test175(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = untypedObjectDeserializer2.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = objJsonDeserializer12.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = untypedObjectDeserializer2.mapArrayToArray(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        untypedObjectDeserializer0._mapType = javaType2;
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer0.getClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        untypedObjectDeserializer0._mapType = javaType2;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer0.getEmptyValue(deserializationContext4);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = vanilla0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = vanilla0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla0.mapObject(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._stringDeserializer;
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = untypedObjectDeserializer2.mapArray(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        untypedObjectDeserializer2._listType = javaType8;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = untypedObjectDeserializer2.createContextual(deserializationContext6, beanProperty7);
        boolean boolean9 = wildcardJsonDeserializer8.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = untypedObjectDeserializer2.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNotNull(objJsonDeserializer11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer2.handledType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        boolean boolean3 = untypedObjectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._mapType;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        untypedObjectDeserializer0._listType = javaType5;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        boolean boolean3 = untypedObjectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer0.createContextual(deserializationContext5, beanProperty6);
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._findCustomDeser(deserializationContext10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._mapType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer8);
        java.util.Collection<java.lang.Object> objCollection10 = objJsonDeserializer9.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = untypedObjectDeserializer2.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean6 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = untypedObjectDeserializer2.mapObject(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = untypedObjectDeserializer2.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._findCustomDeser(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        java.util.Collection<java.lang.Object> objCollection10 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer2.createContextual(deserializationContext11, beanProperty12);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        boolean boolean3 = untypedObjectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer0.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = wildcardJsonDeserializer7.getObjectIdReader();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
// flaky "11) test200(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNull(objJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = untypedObjectDeserializer2.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._numberDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._stringDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objJsonDeserializer10.deserialize(jsonParser11, deserializationContext12, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = vanilla0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla0.deserialize(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = untypedObjectDeserializer2.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = vanilla0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla0.mapArray(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        untypedObjectDeserializer2._stringDeserializer = objJsonDeserializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        untypedObjectDeserializer2._listType = javaType12;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = untypedObjectDeserializer2.deserializeWithType(jsonParser12, deserializationContext13, typeDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        java.lang.Object obj11 = wildcardJsonDeserializer10.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer12);
        boolean boolean14 = objJsonDeserializer13.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = untypedObjectDeserializer2.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        untypedObjectDeserializer2._listType = javaType15;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = untypedObjectDeserializer2.mapArray(jsonParser17, deserializationContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._findCustomDeser(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = vanilla0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = vanilla0.mapObject(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer2.createContextual(deserializationContext11, beanProperty12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = objJsonDeserializer14.unwrappingDeserializer(nameTransformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = wildcardJsonDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = wildcardJsonDeserializer5.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = wildcardJsonDeserializer5.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = wildcardJsonDeserializer5.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = untypedObjectDeserializer2.mapObject(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._clearIfStdImpl(objJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._findCustomDeser(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = vanilla0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = vanilla0.mapArrayToArray(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = wildcardJsonDeserializer5.getObjectIdReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "12) test224(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        java.lang.Object obj11 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._findCustomDeser(deserializationContext12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType14 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer15);
        boolean boolean17 = objJsonDeserializer16.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._findCustomDeser(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer4.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer4._listDeserializer;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = vanilla0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = vanilla0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer8 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer8._listDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objJsonDeserializer7.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer7._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer7.getEmptyValue(deserializationContext11);
        untypedObjectDeserializer0._listDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.databind.JavaType javaType14 = untypedObjectDeserializer7.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType15 = untypedObjectDeserializer7._mapType;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer2._findCustomDeser(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._findCustomDeser(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = objJsonDeserializer11.unwrappingDeserializer(nameTransformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer2.mapObject(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = untypedObjectDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer10._stringDeserializer;
        java.lang.Class<?> wildcardClass19 = untypedObjectDeserializer10.getValueClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(objJsonDeserializer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer2.createContextual(deserializationContext11, beanProperty12);
        java.lang.Object obj14 = wildcardJsonDeserializer13.getNullValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._numberDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2.getValueType();
        java.lang.Object obj10 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer2.getValueType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = wildcardJsonDeserializer7.getObjectIdReader();
        java.lang.Object obj9 = wildcardJsonDeserializer7.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer2._listDeserializer;
        boolean boolean4 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._listType = javaType9;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        boolean boolean3 = untypedObjectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer0.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer0._stringDeserializer;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
// flaky "13) test243(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = untypedObjectDeserializer2.getValueClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = untypedObjectDeserializer2.mapArrayToArray(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.lang.Object obj5 = untypedObjectDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = untypedObjectDeserializer10._numberDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = objJsonDeserializer17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objJsonDeserializer17);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        boolean boolean3 = untypedObjectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer4.handledType();
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer4._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType9, javaType10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = untypedObjectDeserializer11.getObjectIdReader();
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer11.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer11._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = untypedObjectDeserializer11.getEmptyValue(deserializationContext15);
        untypedObjectDeserializer4._listDeserializer = untypedObjectDeserializer11;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer2._clearIfStdImpl((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer11);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objJsonDeserializer18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = untypedObjectDeserializer2.mapArray(jsonParser18, deserializationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer12.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = objJsonDeserializer12.unwrappingDeserializer(nameTransformer15);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer4.handledType();
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer4._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType9, javaType10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = untypedObjectDeserializer11.getObjectIdReader();
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer11.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer11._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = untypedObjectDeserializer11.getEmptyValue(deserializationContext15);
        untypedObjectDeserializer4._listDeserializer = untypedObjectDeserializer11;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer2._clearIfStdImpl((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer11);
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        untypedObjectDeserializer11._mapType = javaType19;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objJsonDeserializer18);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        untypedObjectDeserializer2._listType = javaType8;
        java.lang.Class<?> wildcardClass10 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = untypedObjectDeserializer2.getNullValue(deserializationContext9);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        boolean boolean3 = untypedObjectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._mapType;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = untypedObjectDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = untypedObjectDeserializer0.deserializeWithType(jsonParser6, deserializationContext7, typeDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "14) test259(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._listType = javaType6;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._findCustomDeser(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer2.getValueType();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = untypedObjectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = untypedObjectDeserializer0.createContextual(deserializationContext2, beanProperty3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty6 = wildcardJsonDeserializer4.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = untypedObjectDeserializer2.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        untypedObjectDeserializer2._listType = javaType15;
        com.fasterxml.jackson.databind.JavaType javaType17 = untypedObjectDeserializer2._mapType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        java.lang.Object obj13 = untypedObjectDeserializer2.getNullValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = untypedObjectDeserializer2.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = untypedObjectDeserializer2.deserialize(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = untypedObjectDeserializer2.deserialize(jsonParser18, deserializationContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer4._listType;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = untypedObjectDeserializer0.mapArrayToArray(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer4.resolve(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._mapDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Object obj10 = untypedObjectDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._mapType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objJsonDeserializer3.replaceDelegatee(objJsonDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        java.lang.Object obj9 = wildcardJsonDeserializer7.getNullValue(deserializationContext8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = wildcardJsonDeserializer7.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = untypedObjectDeserializer2.createContextual(deserializationContext6, beanProperty7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = untypedObjectDeserializer2.mapArrayToArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = untypedObjectDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = untypedObjectDeserializer2.mapObject(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = untypedObjectDeserializer2.mapArrayToArray(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        boolean boolean11 = untypedObjectDeserializer4.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        untypedObjectDeserializer4._mapType = javaType12;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer4._mapDeserializer;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(objJsonDeserializer14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        untypedObjectDeserializer0._mapType = javaType2;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer2.getValueType();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer2.handledType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = untypedObjectDeserializer2.getNullValue(deserializationContext9);
        java.lang.Object obj11 = untypedObjectDeserializer2.getNullValue();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer2.getValueClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType10 = untypedObjectDeserializer2._mapType;
        boolean boolean11 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = untypedObjectDeserializer2.deserializeWithType(jsonParser12, deserializationContext13, typeDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.databind.JavaType javaType12 = untypedObjectDeserializer4._mapType;
        com.fasterxml.jackson.databind.JavaType javaType13 = untypedObjectDeserializer4._listType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer4._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer4._stringDeserializer;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = untypedObjectDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer10._stringDeserializer;
        boolean boolean19 = untypedObjectDeserializer10.isCachable();
        java.util.Collection<java.lang.Object> objCollection20 = untypedObjectDeserializer10.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(objJsonDeserializer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objCollection20);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer0._listType;
        java.lang.Object obj6 = untypedObjectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer0.getClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.databind.JavaType javaType12 = untypedObjectDeserializer4._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer4._findCustomDeser(deserializationContext13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer2.createContextual(deserializationContext11, beanProperty12);
        boolean boolean14 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objJsonDeserializer15);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        java.lang.Object obj11 = untypedObjectDeserializer2.getNullValue();
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer6);
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty7 = untypedObjectDeserializer2.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer15 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType16 = untypedObjectDeserializer15.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty18 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = untypedObjectDeserializer15.createContextual(deserializationContext17, beanProperty18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = untypedObjectDeserializer2.deserialize(jsonParser13, deserializationContext14, (java.lang.Object) deserializationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer19);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._listType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = untypedObjectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Object obj8 = untypedObjectDeserializer0.getNullValue(deserializationContext7);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = untypedObjectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = untypedObjectDeserializer0.createContextual(deserializationContext2, beanProperty3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = untypedObjectDeserializer0.getEmptyValue(deserializationContext5);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = untypedObjectDeserializer0.getValueType();
        boolean boolean2 = untypedObjectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2.getValueType();
        java.lang.Object obj10 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = untypedObjectDeserializer2.mapArrayToArray(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer16 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType14, javaType15);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader17 = untypedObjectDeserializer16.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer16._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = untypedObjectDeserializer16.createContextual(deserializationContext19, beanProperty20);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty23 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = untypedObjectDeserializer16.createContextual(deserializationContext22, beanProperty23);
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        untypedObjectDeserializer16._mapType = javaType25;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer29 = untypedObjectDeserializer16.createContextual(deserializationContext27, beanProperty28);
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        untypedObjectDeserializer16._listType = javaType30;
        untypedObjectDeserializer2._numberDeserializer = untypedObjectDeserializer16;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(objectIdReader17);
        org.junit.Assert.assertNull(objJsonDeserializer18);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer21);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer24);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer29);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        untypedObjectDeserializer0._mapType = javaType3;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._numberDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objJsonDeserializer9.getEmptyValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = untypedObjectDeserializer2.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer6);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objJsonDeserializer7);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._listType = javaType6;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._mapType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        untypedObjectDeserializer2._listType = javaType4;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2.getValueType();
        java.lang.Object obj10 = untypedObjectDeserializer2.getNullValue();
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer2.handledType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = untypedObjectDeserializer2.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = untypedObjectDeserializer2.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = untypedObjectDeserializer0.getValueType();
        boolean boolean2 = untypedObjectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection3 = untypedObjectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objCollection3);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2.getValueType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        java.lang.Class<?> wildcardClass10 = untypedObjectDeserializer2.handledType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        untypedObjectDeserializer2._mapType = javaType8;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = untypedObjectDeserializer2.mapArrayToArray(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer0.getValueType();
        java.lang.Object obj6 = untypedObjectDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer4.getClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        java.lang.Object obj9 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = untypedObjectDeserializer2.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer2.getValueClass();
        boolean boolean6 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = untypedObjectDeserializer2.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = untypedObjectDeserializer2.mapObject(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer2.getValueClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue(deserializationContext11);
        boolean boolean13 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj14 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty18 = objJsonDeserializer16.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean18 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType19 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType20 = untypedObjectDeserializer2.getValueType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(javaType20);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        java.lang.Class<?> wildcardClass5 = objJsonDeserializer4.getClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = untypedObjectDeserializer0.getEmptyValue(deserializationContext5);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._listDeserializer;
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = objJsonDeserializer4.getEmptyValue(deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer0._listType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer0._mapType;
        java.lang.Object obj7 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = null;
        untypedObjectDeserializer0._stringDeserializer = objJsonDeserializer8;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer10.createContextual(deserializationContext11, beanProperty12);
        com.fasterxml.jackson.databind.JavaType javaType14 = untypedObjectDeserializer10._listType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer2._clearIfStdImpl((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer10);
        com.fasterxml.jackson.databind.JavaType javaType16 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(javaType16);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue(deserializationContext11);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        untypedObjectDeserializer2._numberDeserializer = untypedObjectDeserializer7;
        java.util.Collection<java.lang.Object> objCollection11 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._mapDeserializer;
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = wildcardJsonDeserializer5.getObjectIdReader();
        java.lang.Object obj7 = wildcardJsonDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = wildcardJsonDeserializer5.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer2.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = untypedObjectDeserializer2.mapObject(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        untypedObjectDeserializer2._stringDeserializer = objJsonDeserializer10;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType13 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType10, javaType11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = untypedObjectDeserializer12.getObjectIdReader();
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer12.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer12._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        untypedObjectDeserializer12._mapType = javaType16;
        java.util.Collection<java.lang.Object> objCollection18 = untypedObjectDeserializer12.getKnownPropertyNames();
        boolean boolean19 = untypedObjectDeserializer12.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = untypedObjectDeserializer12.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = untypedObjectDeserializer2.deserialize(jsonParser8, deserializationContext9, (java.lang.Object) untypedObjectDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer (by deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer20);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._listDeserializer;
        java.lang.Object obj10 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue(deserializationContext11);
        boolean boolean13 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj14 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer15);
        com.fasterxml.jackson.databind.JavaType javaType17 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        java.lang.Object obj9 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer4.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = untypedObjectDeserializer4.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.JavaType javaType14 = untypedObjectDeserializer4.getValueType();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._listType;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        untypedObjectDeserializer2._listType = javaType10;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._mapDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = untypedObjectDeserializer2.mapArrayToArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = untypedObjectDeserializer2.createContextual(deserializationContext6, beanProperty7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = wildcardJsonDeserializer8.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = untypedObjectDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer2._numberDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer2.getValueClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        untypedObjectDeserializer0._listType = javaType2;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        untypedObjectDeserializer0._listType = javaType4;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer0.mapObject(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objJsonDeserializer1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = untypedObjectDeserializer2.getEmptyValue(deserializationContext10);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Object obj11 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = untypedObjectDeserializer2.createContextual(deserializationContext10, beanProperty11);
        com.fasterxml.jackson.databind.JavaType javaType13 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = untypedObjectDeserializer0._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection2 = untypedObjectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._mapDeserializer;
        org.junit.Assert.assertNull(objJsonDeserializer1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objJsonDeserializer3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType10 = untypedObjectDeserializer2._mapType;
        boolean boolean11 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = untypedObjectDeserializer2.mapArrayToArray(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer4._listType;
        java.lang.Object obj12 = untypedObjectDeserializer4.getEmptyValue();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = untypedObjectDeserializer2.getEmptyValue(deserializationContext12);
        boolean boolean14 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = untypedObjectDeserializer2.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean6 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._findCustomDeser(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType10 = untypedObjectDeserializer2._mapType;
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer2.getValueClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean6 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objJsonDeserializer7);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._numberDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.replaceDelegatee(objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._listType = javaType6;
        java.lang.Object obj8 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.mapArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        boolean boolean11 = untypedObjectDeserializer4.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = untypedObjectDeserializer4.mapArray(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objJsonDeserializer8.isCachable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.JavaType javaType13 = untypedObjectDeserializer2.getValueType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        untypedObjectDeserializer0._mapType = javaType2;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = untypedObjectDeserializer0.mapArrayToArray(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer4.getClass();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = untypedObjectDeserializer0.mapArrayToArray(jsonParser1, deserializationContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer2._findCustomDeser(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer4.handledType();
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer4._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType9, javaType10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = untypedObjectDeserializer11.getObjectIdReader();
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer11.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer11._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = untypedObjectDeserializer11.getEmptyValue(deserializationContext15);
        untypedObjectDeserializer4._listDeserializer = untypedObjectDeserializer11;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer2._clearIfStdImpl((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer11);
        boolean boolean19 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer20 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass21 = untypedObjectDeserializer20.handledType();
        java.lang.Class<?> wildcardClass22 = untypedObjectDeserializer20.getValueClass();
        java.lang.Class<?> wildcardClass23 = untypedObjectDeserializer20.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer24 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = untypedObjectDeserializer24._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection26 = untypedObjectDeserializer24.getKnownPropertyNames();
        untypedObjectDeserializer20._mapDeserializer = untypedObjectDeserializer24;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = untypedObjectDeserializer24.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = untypedObjectDeserializer24._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType31 = untypedObjectDeserializer24._listType;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer24;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer33 = untypedObjectDeserializer2._mapDeserializer;
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objJsonDeserializer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNull(objCollection26);
        org.junit.Assert.assertNotNull(objJsonDeserializer29);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertNull(objJsonDeserializer33);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        untypedObjectDeserializer2._listType = javaType14;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        boolean boolean3 = untypedObjectDeserializer0.isCachable();
        boolean boolean4 = untypedObjectDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer0._listType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer0._mapType;
        java.lang.Object obj7 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = untypedObjectDeserializer0.mapArrayToArray(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objJsonDeserializer8.getNullValue(deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        untypedObjectDeserializer2._listType = javaType8;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer2.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        boolean boolean11 = untypedObjectDeserializer4.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer4._findCustomDeser(deserializationContext12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        boolean boolean5 = objJsonDeserializer4.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objJsonDeserializer4.getDelegatee();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.getDelegatee();
        boolean boolean8 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._numberDeserializer;
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = untypedObjectDeserializer2.mapArray(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(objJsonDeserializer18);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = untypedObjectDeserializer2.mapArray(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer7._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer7.getEmptyValue(deserializationContext11);
        untypedObjectDeserializer0._listDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        untypedObjectDeserializer7._mapType = javaType14;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer7.resolve(deserializationContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = untypedObjectDeserializer2.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        boolean boolean4 = untypedObjectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer7._mapDeserializer;
        java.lang.Class<?> wildcardClass10 = untypedObjectDeserializer7.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer7.unwrappingDeserializer(nameTransformer11);
        untypedObjectDeserializer0._numberDeserializer = objJsonDeserializer12;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer4.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = untypedObjectDeserializer4.deserialize(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(objJsonDeserializer13);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = untypedObjectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer0._mapType = javaType7;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = untypedObjectDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._findCustomDeser(deserializationContext10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer2.getValueClass();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer2.handledType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = untypedObjectDeserializer2.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = untypedObjectDeserializer2.mapArrayToArray(jsonParser13, deserializationContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType14 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer15);
        java.util.Collection<java.lang.Object> objCollection17 = objJsonDeserializer16.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(objJsonDeserializer16);
        org.junit.Assert.assertNull(objCollection17);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer4.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = untypedObjectDeserializer4.mapArrayToArray(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._stringDeserializer;
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._findCustomDeser(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer0._listType;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "15) test415(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(javaType5);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        untypedObjectDeserializer2._numberDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer2._stringDeserializer;
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        java.lang.Class<?> wildcardClass11 = untypedObjectDeserializer4.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = untypedObjectDeserializer4.mapArray(jsonParser12, deserializationContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = objJsonDeserializer6.getEmptyValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = untypedObjectDeserializer2.mapArray(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        java.lang.Object obj8 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        java.lang.Object obj10 = untypedObjectDeserializer2.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = untypedObjectDeserializer2.createContextual(deserializationContext10, beanProperty11);
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        untypedObjectDeserializer2._listType = javaType13;
        java.lang.Class<?> wildcardClass15 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        boolean boolean5 = objJsonDeserializer4.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = objJsonDeserializer4.getNullValue(deserializationContext6);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer2.deserialize(jsonParser8, deserializationContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = wildcardJsonDeserializer5.getObjectIdReader();
        java.lang.Object obj7 = wildcardJsonDeserializer5.getNullValue();
        java.lang.Object obj8 = wildcardJsonDeserializer5.getNullValue();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.databind.JavaType javaType11 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._stringDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = objJsonDeserializer12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        untypedObjectDeserializer0._listType = javaType8;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = untypedObjectDeserializer0.mapObject(jsonParser3, deserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._listType = javaType6;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._numberDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer8);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType18 = untypedObjectDeserializer2._listType;
        java.lang.Class<?> wildcardClass19 = untypedObjectDeserializer2.handledType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = untypedObjectDeserializer10.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer10._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = untypedObjectDeserializer10.createContextual(deserializationContext19, beanProperty20);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = untypedObjectDeserializer10._mapDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer17);
        org.junit.Assert.assertNull(objJsonDeserializer18);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer21);
        org.junit.Assert.assertNull(objJsonDeserializer22);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer4.handledType();
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer4._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType9, javaType10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = untypedObjectDeserializer11.getObjectIdReader();
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer11.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer11._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = untypedObjectDeserializer11.getEmptyValue(deserializationContext15);
        untypedObjectDeserializer4._listDeserializer = untypedObjectDeserializer11;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer2._clearIfStdImpl((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer11);
        boolean boolean19 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer20 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass21 = untypedObjectDeserializer20.handledType();
        java.lang.Class<?> wildcardClass22 = untypedObjectDeserializer20.getValueClass();
        java.lang.Class<?> wildcardClass23 = untypedObjectDeserializer20.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer24 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = untypedObjectDeserializer24._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection26 = untypedObjectDeserializer24.getKnownPropertyNames();
        untypedObjectDeserializer20._mapDeserializer = untypedObjectDeserializer24;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = untypedObjectDeserializer24.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = untypedObjectDeserializer24._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType31 = untypedObjectDeserializer24._listType;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer24;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader33 = untypedObjectDeserializer24.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objJsonDeserializer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNull(objCollection26);
        org.junit.Assert.assertNotNull(objJsonDeserializer29);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertNull(objectIdReader33);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue(deserializationContext11);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer2.handledType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = untypedObjectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer0._numberDeserializer;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = untypedObjectDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "16) test436(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objJsonDeserializer6);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = wildcardJsonDeserializer5.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = wildcardJsonDeserializer5.getKnownPropertyNames();
        boolean boolean9 = wildcardJsonDeserializer5.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = wildcardJsonDeserializer5.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Object obj2 = untypedObjectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer0._stringDeserializer;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = untypedObjectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = untypedObjectDeserializer0.mapArray(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj2);
// flaky "17) test438(com.fasterxml.jackson.databind.deser.std.RegressionTest0)":         org.junit.Assert.assertNotNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._stringDeserializer;
        boolean boolean8 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer3 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNull(objJsonDeserializer3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        untypedObjectDeserializer2._numberDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.JavaType javaType13 = untypedObjectDeserializer2._listType;
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._listDeserializer;
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = untypedObjectDeserializer2._listType;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = untypedObjectDeserializer2.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = untypedObjectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        untypedObjectDeserializer0._stringDeserializer = objJsonDeserializer7;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        java.lang.Object obj13 = untypedObjectDeserializer2.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = untypedObjectDeserializer2.deserializeWithType(jsonParser14, deserializationContext15, typeDeserializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._listType;
        java.lang.Object obj9 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer2._listType;
        java.util.Collection<java.lang.Object> objCollection9 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType10 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType12 = untypedObjectDeserializer2._mapType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        untypedObjectDeserializer2._mapType = javaType6;
        java.util.Collection<java.lang.Object> objCollection8 = untypedObjectDeserializer2.getKnownPropertyNames();
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = untypedObjectDeserializer2.createContextual(deserializationContext10, beanProperty11);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType14 = untypedObjectDeserializer2.getValueType();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass5 = untypedObjectDeserializer4.handledType();
        java.lang.Class<?> wildcardClass6 = untypedObjectDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass7 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer4._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer11 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType9, javaType10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = untypedObjectDeserializer11.getObjectIdReader();
        java.lang.Class<?> wildcardClass13 = untypedObjectDeserializer11.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer11._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = untypedObjectDeserializer11.getEmptyValue(deserializationContext15);
        untypedObjectDeserializer4._listDeserializer = untypedObjectDeserializer11;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = untypedObjectDeserializer2._clearIfStdImpl((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer11);
        boolean boolean19 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer20 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass21 = untypedObjectDeserializer20.handledType();
        java.lang.Class<?> wildcardClass22 = untypedObjectDeserializer20.getValueClass();
        java.lang.Class<?> wildcardClass23 = untypedObjectDeserializer20.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer24 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = untypedObjectDeserializer24._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection26 = untypedObjectDeserializer24.getKnownPropertyNames();
        untypedObjectDeserializer20._mapDeserializer = untypedObjectDeserializer24;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer29 = untypedObjectDeserializer24.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = untypedObjectDeserializer24._stringDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType31 = untypedObjectDeserializer24._listType;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer24;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer33 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer34 = untypedObjectDeserializer2._listDeserializer;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty36 = objJsonDeserializer34.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objJsonDeserializer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNull(objCollection26);
        org.junit.Assert.assertNotNull(objJsonDeserializer29);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNull(javaType31);
        org.junit.Assert.assertNull(wildcardJsonDeserializer33);
        org.junit.Assert.assertNotNull(objJsonDeserializer34);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        untypedObjectDeserializer2._mapType = javaType8;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2._mapDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer2.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = untypedObjectDeserializer4.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer4._listDeserializer;
        boolean boolean11 = untypedObjectDeserializer4.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        untypedObjectDeserializer4._mapType = javaType12;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = untypedObjectDeserializer4.getObjectIdReader();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objJsonDeserializer9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(objectIdReader14);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = untypedObjectDeserializer2.createContextual(deserializationContext3, beanProperty4);
        java.lang.Object obj6 = untypedObjectDeserializer2.getNullValue();
        java.util.Collection<java.lang.Object> objCollection7 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer10.createContextual(deserializationContext11, beanProperty12);
        com.fasterxml.jackson.databind.JavaType javaType14 = untypedObjectDeserializer10._listType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer2._clearIfStdImpl((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer10);
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer18 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType16, javaType17);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader19 = untypedObjectDeserializer18.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer20 = untypedObjectDeserializer18._mapDeserializer;
        java.lang.Class<?> wildcardClass21 = untypedObjectDeserializer18.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader22 = untypedObjectDeserializer18.getObjectIdReader();
        java.lang.Object obj23 = untypedObjectDeserializer18.getEmptyValue();
        untypedObjectDeserializer2._numberDeserializer = untypedObjectDeserializer18;
        java.lang.Object obj25 = untypedObjectDeserializer18.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType26 = untypedObjectDeserializer18._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer18.resolve(deserializationContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objectIdReader19);
        org.junit.Assert.assertNull(objJsonDeserializer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNull(objectIdReader22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(javaType26);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = untypedObjectDeserializer2.createContextual(deserializationContext13, beanProperty14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = untypedObjectDeserializer2.deserialize(jsonParser16, deserializationContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer15);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        java.lang.Object obj7 = untypedObjectDeserializer2.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = objJsonDeserializer12.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader15 = objJsonDeserializer14.getObjectIdReader();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(objJsonDeserializer12);
        org.junit.Assert.assertNotNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(objectIdReader15);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer7._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer7.getEmptyValue(deserializationContext11);
        untypedObjectDeserializer0._listDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = untypedObjectDeserializer7.createContextual(deserializationContext14, beanProperty15);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        java.lang.Object obj18 = wildcardJsonDeserializer16.getNullValue(deserializationContext17);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._mapType;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        boolean boolean5 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._numberDeserializer;
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer2.getNullValue(deserializationContext11);
        boolean boolean13 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = untypedObjectDeserializer2.getDelegatee();
        boolean boolean15 = untypedObjectDeserializer2.isCachable();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        untypedObjectDeserializer2._mapType = javaType11;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        java.lang.Object obj16 = untypedObjectDeserializer2.getEmptyValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = untypedObjectDeserializer2.getClass();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
        org.junit.Assert.assertNull(objJsonDeserializer14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._mapType = javaType7;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = untypedObjectDeserializer2.mapArrayToArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer2 = untypedObjectDeserializer0._mapDeserializer;
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._mapType;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer4 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer4._listDeserializer;
        java.util.Collection<java.lang.Object> objCollection6 = untypedObjectDeserializer4.getKnownPropertyNames();
        untypedObjectDeserializer0._mapDeserializer = untypedObjectDeserializer4;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer4.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = untypedObjectDeserializer4.mapArrayToArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = untypedObjectDeserializer2.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        untypedObjectDeserializer2._numberDeserializer = untypedObjectDeserializer7;
        java.util.Collection<java.lang.Object> objCollection11 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType12 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        untypedObjectDeserializer2._mapType = javaType13;
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        untypedObjectDeserializer2._mapType = javaType3;
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = untypedObjectDeserializer2.createContextual(deserializationContext8, beanProperty9);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = untypedObjectDeserializer2._findCustomDeser(deserializationContext12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objJsonDeserializer11);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla vanilla0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;
        java.lang.Class<?> wildcardClass1 = vanilla0.getClass();
        org.junit.Assert.assertNotNull(vanilla0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = untypedObjectDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        boolean boolean9 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = untypedObjectDeserializer2.createContextual(deserializationContext10, beanProperty11);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer12);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        untypedObjectDeserializer2._mapType = javaType9;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer1 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        untypedObjectDeserializer0._listType = javaType2;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        untypedObjectDeserializer0._listType = javaType4;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer0._listType;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer7.handledType();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.getValueClass();
        java.lang.Class<?> wildcardClass10 = untypedObjectDeserializer7.handledType();
        boolean boolean11 = untypedObjectDeserializer7.isCachable();
        untypedObjectDeserializer0._listDeserializer = untypedObjectDeserializer7;
        boolean boolean13 = untypedObjectDeserializer7.isCachable();
        org.junit.Assert.assertNull(objJsonDeserializer1);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(untypedObjectDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        untypedObjectDeserializer2._listType = javaType7;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        java.lang.Object obj11 = untypedObjectDeserializer2.getNullValue(deserializationContext10);
        java.lang.Object obj12 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = untypedObjectDeserializer2.createContextual(deserializationContext6, beanProperty7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = untypedObjectDeserializer2.mapArray(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = untypedObjectDeserializer2._mapDeserializer;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = untypedObjectDeserializer2._mapDeserializer;
        java.lang.Class<?> wildcardClass8 = untypedObjectDeserializer2.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        untypedObjectDeserializer2._stringDeserializer = objJsonDeserializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        untypedObjectDeserializer2._listType = javaType12;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = untypedObjectDeserializer2.getDelegatee();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objJsonDeserializer5);
        org.junit.Assert.assertNull(objJsonDeserializer6);
        org.junit.Assert.assertNull(objJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = untypedObjectDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2._listType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            untypedObjectDeserializer2.resolve(deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = untypedObjectDeserializer0._listType;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer0.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = untypedObjectDeserializer0._listType;
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer2.handledType();
        java.lang.Object obj10 = untypedObjectDeserializer2.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.instance;
        java.lang.Class<?> wildcardClass1 = untypedObjectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass2 = untypedObjectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass3 = untypedObjectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer0._listDeserializer;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer7 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType5, javaType6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = untypedObjectDeserializer7.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = untypedObjectDeserializer7.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer7._stringDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        java.lang.Object obj12 = untypedObjectDeserializer7.getEmptyValue(deserializationContext11);
        untypedObjectDeserializer0._listDeserializer = untypedObjectDeserializer7;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = untypedObjectDeserializer7.createContextual(deserializationContext14, beanProperty15);
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = untypedObjectDeserializer7._listDeserializer;
        boolean boolean18 = untypedObjectDeserializer7.isCachable();
        org.junit.Assert.assertNotNull(untypedObjectDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNull(objJsonDeserializer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        java.lang.Object obj5 = untypedObjectDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = untypedObjectDeserializer2.getObjectIdReader();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = untypedObjectDeserializer2._listDeserializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = untypedObjectDeserializer2.unwrappingDeserializer(nameTransformer9);
        java.lang.Object obj11 = untypedObjectDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = untypedObjectDeserializer2._listDeserializer;
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objJsonDeserializer8);
        org.junit.Assert.assertNotNull(objJsonDeserializer10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objJsonDeserializer12);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = untypedObjectDeserializer2.handledType();
        com.fasterxml.jackson.databind.JavaType javaType5 = untypedObjectDeserializer2._mapType;
        com.fasterxml.jackson.databind.JavaType javaType6 = untypedObjectDeserializer2.getValueType();
        boolean boolean7 = untypedObjectDeserializer2.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        untypedObjectDeserializer2._mapType = javaType8;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer12 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType10, javaType11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = untypedObjectDeserializer12.createContextual(deserializationContext13, beanProperty14);
        java.lang.Object obj16 = untypedObjectDeserializer12.getNullValue();
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer12.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer20 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType18, javaType19);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext21 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = untypedObjectDeserializer20.createContextual(deserializationContext21, beanProperty22);
        com.fasterxml.jackson.databind.JavaType javaType24 = untypedObjectDeserializer20._listType;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer25 = untypedObjectDeserializer12._clearIfStdImpl((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer20);
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer28 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType26, javaType27);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader29 = untypedObjectDeserializer28.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer30 = untypedObjectDeserializer28._mapDeserializer;
        java.lang.Class<?> wildcardClass31 = untypedObjectDeserializer28.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader32 = untypedObjectDeserializer28.getObjectIdReader();
        java.lang.Object obj33 = untypedObjectDeserializer28.getEmptyValue();
        untypedObjectDeserializer12._numberDeserializer = untypedObjectDeserializer28;
        java.lang.Object obj35 = untypedObjectDeserializer28.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer36 = untypedObjectDeserializer2.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>) untypedObjectDeserializer28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer23);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(objJsonDeserializer25);
        org.junit.Assert.assertNull(objectIdReader29);
        org.junit.Assert.assertNull(objJsonDeserializer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(objectIdReader32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.fasterxml.jackson.databind.JavaType javaType0 = null;
        com.fasterxml.jackson.databind.JavaType javaType1 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer2 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType0, javaType1);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = untypedObjectDeserializer2.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer4 = untypedObjectDeserializer2._numberDeserializer;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = untypedObjectDeserializer2.createContextual(deserializationContext5, beanProperty6);
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer untypedObjectDeserializer10 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer(javaType8, javaType9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = untypedObjectDeserializer10.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = untypedObjectDeserializer10.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = untypedObjectDeserializer10._numberDeserializer;
        java.lang.Class<?> wildcardClass14 = untypedObjectDeserializer10.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = untypedObjectDeserializer10._listDeserializer;
        untypedObjectDeserializer2._listDeserializer = untypedObjectDeserializer10;
        java.util.Collection<java.lang.Object> objCollection17 = untypedObjectDeserializer2.getKnownPropertyNames();
        java.lang.Object obj18 = untypedObjectDeserializer2.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.BeanProperty beanProperty20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = untypedObjectDeserializer2.createContextual(deserializationContext19, beanProperty20);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer24 = untypedObjectDeserializer2._findCustomDeser(deserializationContext22, javaType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNull(objJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objJsonDeserializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(objJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardJsonDeserializer21);
    }
}
