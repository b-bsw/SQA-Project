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
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer9.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType13 = arrayDeserializer9.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayDeserializer9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        boolean boolean7 = objectDeserializer0.isCachable();
        boolean boolean8 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        java.lang.Class<?> wildcardClass4 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean11 = jsonNodeDeserializer0.isCachable();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer0.getNullValue(deserializationContext16);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getEmptyValue(deserializationContext1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.util.Collection<java.lang.Object> objCollection11 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer13 = arrayDeserializer0.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer13);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = objectDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objectDeserializer0.getObjectIdReader();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer11 = objectDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer11);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode1 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection2 = arrayDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode1);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = arrayDeserializer0.getObjectIdReader();
        boolean boolean13 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue(deserializationContext13);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer15 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer15.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer15.getNullValue(deserializationContext17);
        com.fasterxml.jackson.databind.JavaType javaType19 = jsonNodeDeserializer15.getValueType();
        boolean boolean20 = jsonNodeDeserializer15.isCachable();
        java.util.Collection<java.lang.Object> objCollection21 = jsonNodeDeserializer15.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType22 = jsonNodeDeserializer15.getValueType();
        boolean boolean23 = jsonNodeDeserializer15.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext24 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = jsonNodeDeserializer15.getEmptyValue(deserializationContext24);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext26 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = jsonNodeDeserializer15.getEmptyValue(deserializationContext26);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode28 = jsonNodeDeserializer0.deserialize(jsonParser13, deserializationContext14, jsonNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(objCollection21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(jsonNode27);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNodeJsonDeserializer6.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer9.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer9.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer9.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer9.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = arrayDeserializer9.getNullValue(deserializationContext17);
        java.lang.Class<?> wildcardClass19 = arrayDeserializer9.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer21 = arrayDeserializer9.unwrappingDeserializer(nameTransformer20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer23 = arrayNodeJsonDeserializer21.unwrappingDeserializer(nameTransformer22);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = objectNodeJsonDeserializer6.replaceDelegatee(arrayNodeJsonDeserializer21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNotNull(arrayDeserializer9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(arrayNode18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer21);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer23);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection7 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.deserialize(jsonParser7, deserializationContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = jsonNodeDeserializer0.deserializeWithType(jsonParser13, deserializationContext14, typeDeserializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer10 = objectDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.util.Collection<java.lang.Object> objCollection11 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        boolean boolean5 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType2 = jsonNodeDeserializer0.getValueType();
        boolean boolean3 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer2 = objectDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = arrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass2 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(jsonNode3);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = objectNodeJsonDeserializer9.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer12 = objectNodeJsonDeserializer9.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNodeJsonDeserializer9.getEmptyValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader10);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer12);
        org.junit.Assert.assertNull(objectNode13);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        boolean boolean7 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = arrayDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        boolean boolean8 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        boolean boolean11 = jsonNodeDeserializer0.isCachable();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        boolean boolean7 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer0.deserialize(jsonParser11, deserializationContext12, arrayNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayNodeJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayNodeJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayNodeJsonDeserializer2.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayNodeJsonDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayNodeJsonDeserializer7.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayNodeJsonDeserializer7.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayNodeJsonDeserializer7.deserialize(jsonParser11, deserializationContext12, arrayNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeJsonDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeJsonDeserializer7.unwrappingDeserializer(nameTransformer9);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        boolean boolean3 = arrayDeserializer0.isCachable();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(arrayNode11);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection7 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.deserialize(jsonParser11, deserializationContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayNodeJsonDeserializer10.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayNodeJsonDeserializer10.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(arrayNode12);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue(deserializationContext7);
        boolean boolean9 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        java.lang.Class<?> wildcardClass14 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean3 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        boolean boolean6 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.deserialize(jsonParser7, deserializationContext8, arrayNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        java.util.Collection<java.lang.Object> objCollection12 = jsonNodeJsonDeserializer11.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        boolean boolean3 = arrayDeserializer0.isCachable();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer0.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayNodeJsonDeserializer8.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayNodeJsonDeserializer8.unwrappingDeserializer(nameTransformer10);
        java.util.Collection<java.lang.Object> objCollection12 = arrayNodeJsonDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayNodeJsonDeserializer8.getNullValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader7);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType14 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getNullValue(deserializationContext15);
        java.lang.Class<?> wildcardClass17 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        boolean boolean5 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean3 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection9 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer0.getEmptyValue(deserializationContext13);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(arrayNode14);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jsonNodeDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass11 = objectDeserializer0.handledType();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode5);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean13 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectIdReader14);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer0.deserialize(jsonParser13, deserializationContext14, arrayNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode12);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer4 = objectDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objectDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        boolean boolean3 = arrayDeserializer0.isCachable();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.deserialize(jsonParser5, deserializationContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer14 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer14);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue();
        boolean boolean11 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer14 = objectDeserializer0.unwrappingDeserializer(nameTransformer13);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer14);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayNodeJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayNodeJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayNodeJsonDeserializer2.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayNodeJsonDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayNodeJsonDeserializer7.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayNodeJsonDeserializer7.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = arrayNodeJsonDeserializer7.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayNodeJsonDeserializer7.getEmptyValue(deserializationContext14);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayNodeJsonDeserializer7.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode20 = arrayNodeJsonDeserializer7.deserialize(jsonParser17, deserializationContext18, arrayNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(arrayNode16);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = objectDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        boolean boolean3 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.handledType();
        boolean boolean7 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        boolean boolean14 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = jsonNode4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        boolean boolean3 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer4 = objectDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType11 = objectDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass12 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        java.util.Collection<java.lang.Object> objCollection9 = objectNodeJsonDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectNodeJsonDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNodeJsonDeserializer8.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer2 = objectDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer6 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer6.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer6.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = arrayDeserializer6.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = arrayDeserializer6.getObjectIdReader();
        boolean boolean13 = arrayDeserializer6.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(arrayDeserializer6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer13 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer13.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer13.getNullValue(deserializationContext15);
        com.fasterxml.jackson.databind.JavaType javaType17 = jsonNodeDeserializer13.getValueType();
        boolean boolean18 = jsonNodeDeserializer13.isCachable();
        java.lang.Class<?> wildcardClass19 = jsonNodeDeserializer13.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = jsonNodeDeserializer13.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer13.getEmptyValue();
        java.lang.Class<?> wildcardClass22 = jsonNodeDeserializer13.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext23 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = jsonNodeDeserializer13.getNullValue(deserializationContext23);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = jsonNodeDeserializer13.getNullValue(deserializationContext25);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext27 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = jsonNodeDeserializer13.getNullValue(deserializationContext27);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode29 = jsonNodeDeserializer0.deserialize(jsonParser11, deserializationContext12, jsonNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(wildcardJsonDeserializer20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(jsonNode28);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayDeserializer7.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer7.getEmptyValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = arrayDeserializer7.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = arrayDeserializer7.getObjectIdReader();
        boolean boolean14 = arrayDeserializer7.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        boolean boolean7 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer8 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer8.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer8.getNullValue();
        java.util.Collection<java.lang.Object> objCollection12 = arrayDeserializer8.getKnownPropertyNames();
        boolean boolean13 = arrayDeserializer8.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer8.getNullValue(deserializationContext14);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = arrayDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer18 = arrayDeserializer8.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode19 = arrayDeserializer8.getEmptyValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer20 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(arrayDeserializer8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(wildcardJsonDeserializer16);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer18);
        org.junit.Assert.assertNull(arrayNode19);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer3 = objectDeserializer0.unwrappingDeserializer(nameTransformer2);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.deserialize(jsonParser4, deserializationContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode1);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer3);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType2 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        boolean boolean4 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.handledType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.deserialize(jsonParser7, deserializationContext8, objectNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = arrayDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNodeJsonDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer11 = objectNodeJsonDeserializer8.unwrappingDeserializer(nameTransformer10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNodeJsonDeserializer11.getNullValue(deserializationContext12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer11);
        org.junit.Assert.assertNull(objectNode13);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection12 = jsonNodeDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectDeserializer0.deserialize(jsonParser10, deserializationContext11, objectNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        boolean boolean6 = arrayDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue(deserializationContext13);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer17 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass18 = jsonNodeDeserializer17.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer17.getEmptyValue(deserializationContext19);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer0.deserialize(jsonParser15, deserializationContext16, jsonNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(jsonNode20);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNodeJsonDeserializer9.getNullValue(deserializationContext10);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode11);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean11 = jsonNodeDeserializer0.isCachable();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getNullValue(deserializationContext15);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.getValueClass();
        boolean boolean10 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(arrayNode12);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType8 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType12 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = objectDeserializer0.deserialize(jsonParser14, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(wildcardJsonDeserializer13);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        boolean boolean10 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = objectDeserializer0.getObjectIdReader();
        java.util.Collection<java.lang.Object> objCollection13 = objectDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty15 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(objCollection13);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        boolean boolean5 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(arrayNode8);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = objectDeserializer0.getObjectIdReader();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        boolean boolean7 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer14 = arrayDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = arrayNodeJsonDeserializer14.deserialize(jsonParser15, deserializationContext16, arrayNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer14);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer9 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass10 = arrayDeserializer9.handledType();
        boolean boolean11 = arrayDeserializer9.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer9.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer14 = arrayDeserializer9.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer9.getEmptyValue(deserializationContext15);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer9.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = objectNodeJsonDeserializer8.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer14);
        org.junit.Assert.assertNull(arrayNode16);
        org.junit.Assert.assertNull(arrayNode17);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer7 = objectDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objectDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer7);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = jsonNodeDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass11 = jsonNode10.getClass();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType2 = arrayDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty4 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(javaType2);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer17 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer17.getNullValue(deserializationContext19);
        com.fasterxml.jackson.databind.JavaType javaType21 = jsonNodeDeserializer17.getValueType();
        boolean boolean22 = jsonNodeDeserializer17.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer23 = jsonNodeDeserializer17.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = jsonNodeDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext25 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = jsonNodeDeserializer17.getNullValue(deserializationContext25);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode27 = jsonNodeDeserializer0.deserialize(jsonParser15, deserializationContext16, jsonNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(wildcardJsonDeserializer14);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(jsonNode26);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = jsonNodeDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty12 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue(deserializationContext9);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = arrayDeserializer0.getObjectIdReader();
        boolean boolean12 = arrayDeserializer0.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(objectNode13);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = jsonNodeDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection12 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getNullValue(deserializationContext14);
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer17 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = jsonNodeDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer17.getNullValue(deserializationContext19);
        java.lang.Class<?> wildcardClass21 = jsonNodeDeserializer17.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = jsonNodeDeserializer17.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode23 = jsonNodeDeserializer0.deserialize(jsonParser15, deserializationContext16, jsonNode22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(jsonNode22);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean3 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        boolean boolean4 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        boolean boolean7 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer0.getValueType();
        boolean boolean11 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer13 = arrayDeserializer0.unwrappingDeserializer(nameTransformer12);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer13);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        boolean boolean3 = arrayDeserializer0.isCachable();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = arrayDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection11 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer12 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass13 = arrayDeserializer12.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer15 = arrayDeserializer12.unwrappingDeserializer(nameTransformer14);
        java.util.Collection<java.lang.Object> objCollection16 = arrayDeserializer12.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNotNull(arrayDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer15);
        org.junit.Assert.assertNull(objCollection16);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue(deserializationContext11);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        boolean boolean6 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objCollection7);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayDeserializer0.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(arrayNode3);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getEmptyValue(deserializationContext4);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        boolean boolean7 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer0.getValueType();
        boolean boolean11 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType13 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(javaType13);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getNullValue(deserializationContext14);
        java.util.Collection<java.lang.Object> objCollection16 = jsonNodeDeserializer0.getKnownPropertyNames();
        boolean boolean17 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNull(objCollection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean3 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer16 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer15);
        java.lang.Class<?> wildcardClass17 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer15 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer15);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType11 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getEmptyValue();
        boolean boolean13 = objectDeserializer0.isCachable();
        boolean boolean14 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode10);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objectNode15);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType5 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType10 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer._instance;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer2 = objectDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty8 = objectNodeJsonDeserializer6.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectDeserializer0);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNodeJsonDeserializer9.deserialize(jsonParser10, deserializationContext11, objectNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayNodeJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayNodeJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayNodeJsonDeserializer2.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayNodeJsonDeserializer7.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayNodeJsonDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayNodeJsonDeserializer7.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayNodeJsonDeserializer7.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayNodeJsonDeserializer7.getNullValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(arrayNode15);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.getEmptyValue(deserializationContext12);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = arrayDeserializer0.getObjectIdReader();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.deserialize(jsonParser6, deserializationContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objectIdReader4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue(deserializationContext12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer15 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer14);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer15);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        boolean boolean3 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = arrayDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = jsonNodeDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(jsonNode6);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader4 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objectIdReader4);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader12 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType13 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType14 = jsonNodeDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(objectIdReader12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = objectDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = objectNodeJsonDeserializer9.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer4 = objectDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        boolean boolean6 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType7 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = objectDeserializer0.deserializeWithType(jsonParser8, deserializationContext9, typeDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(javaType7);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType14 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer0.getEmptyValue(deserializationContext16);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNotNull(jsonNode17);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        boolean boolean7 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue(deserializationContext8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectNode9);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue(deserializationContext11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer10 = arrayDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.getNullValue(deserializationContext12);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer2 = objectDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = objectDeserializer0.deserializeWithType(jsonParser9, deserializationContext10, typeDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objectNode8);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(objectIdReader11);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer1 = arrayDeserializer0.getDelegatee();
        boolean boolean2 = arrayDeserializer0.isCachable();
        boolean boolean3 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer4 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer6 = arrayDeserializer4.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer4.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer4.getNullValue(deserializationContext8);
        boolean boolean10 = arrayDeserializer4.isCachable();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer4.getValueClass();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer4.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = arrayDeserializer4.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer15 = arrayDeserializer4.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer4.getEmptyValue(deserializationContext16);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer18 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(wildcardJsonDeserializer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer4);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer15);
        org.junit.Assert.assertNull(arrayNode17);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = objectDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getNullValue(deserializationContext7);
        java.lang.Class<?> wildcardClass9 = objectDeserializer0.getValueClass();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.deserialize(jsonParser4, deserializationContext5, arrayNode6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(arrayNode3);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        boolean boolean3 = arrayDeserializer0.isCachable();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode9);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.handledType();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection11 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
        org.junit.Assert.assertNull(objectNode12);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        boolean boolean7 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass13 = arrayDeserializer0.getValueClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        boolean boolean1 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass2 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = jsonNodeDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.JavaType javaType12 = jsonNodeDeserializer0.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty14 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNull(javaType12);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass6 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue(deserializationContext7);
        boolean boolean9 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(jsonNode13);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue();
        boolean boolean6 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode7);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getNullValue(deserializationContext10);
        boolean boolean12 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue(deserializationContext9);
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer2 = objectDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.JavaType javaType5 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection10 = arrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(objCollection10);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = jsonNodeDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference 'hi!': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayNodeJsonDeserializer5.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = arrayNodeJsonDeserializer5.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayNodeJsonDeserializer5.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayNodeJsonDeserializer5.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer8 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer7);
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer8);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer4 = objectDeserializer0.unwrappingDeserializer(nameTransformer3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNodeJsonDeserializer4.getNullValue(deserializationContext5);
        java.util.Collection<java.lang.Object> objCollection7 = objectNodeJsonDeserializer4.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNodeJsonDeserializer4.getNullValue(deserializationContext8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        boolean boolean8 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertNull(arrayNode11);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = arrayDeserializer0.getObjectIdReader();
        boolean boolean6 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer7 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer7.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer7.getEmptyValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = arrayDeserializer7.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer7.getNullValue(deserializationContext13);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(arrayDeserializer7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(arrayNode14);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        boolean boolean11 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer9 = objectDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNodeJsonDeserializer9.getNullValue();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer9);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objectDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer2 = objectDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode5);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean11 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getEmptyValue(deserializationContext12);
        java.util.Collection<java.lang.Object> objCollection14 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = jsonNodeDeserializer0.getDelegatee();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getEmptyValue(deserializationContext12);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getEmptyValue(deserializationContext14);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer0.getNullValue(deserializationContext16);
        boolean boolean18 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue();
        boolean boolean15 = jsonNodeDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getEmptyValue(deserializationContext7);
        boolean boolean9 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass10 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer13 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer15 = arrayDeserializer13.unwrappingDeserializer(nameTransformer14);
        java.lang.Class<?> wildcardClass16 = arrayDeserializer13.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer18 = arrayDeserializer13.unwrappingDeserializer(nameTransformer17);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode20 = arrayDeserializer13.getEmptyValue(deserializationContext19);
        com.fasterxml.jackson.databind.JavaType javaType21 = arrayDeserializer13.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(objectNode12);
        org.junit.Assert.assertNotNull(arrayDeserializer13);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer18);
        org.junit.Assert.assertNull(arrayNode20);
        org.junit.Assert.assertNull(javaType21);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection10 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass11 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection14 = arrayDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNull(objCollection14);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer10 = objectDeserializer0.unwrappingDeserializer(nameTransformer9);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection12 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer10);
        org.junit.Assert.assertNull(objectNode11);
        org.junit.Assert.assertNull(objCollection12);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType10 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getEmptyValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(objCollection8);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean3 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.handledType();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType11 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = jsonNodeDeserializer0.deserializeWithType(jsonParser15, deserializationContext16, typeDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer10 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer12 = arrayDeserializer10.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayDeserializer10.getNullValue();
        java.util.Collection<java.lang.Object> objCollection14 = arrayDeserializer10.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode16 = arrayDeserializer10.getNullValue(deserializationContext15);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(arrayDeserializer10);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer12);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(arrayNode16);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectDeserializer0.getEmptyValue(deserializationContext8);
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertNull(objectNode9);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayNodeJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayNodeJsonDeserializer2.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer6 = arrayNodeJsonDeserializer2.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayNodeJsonDeserializer2.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer9 = arrayNodeJsonDeserializer2.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayNodeJsonDeserializer9.getEmptyValue(deserializationContext10);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayNodeJsonDeserializer9.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection13 = arrayNodeJsonDeserializer9.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader14 = arrayNodeJsonDeserializer9.getObjectIdReader();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objectIdReader14);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer6 = objectDeserializer0.unwrappingDeserializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty9 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = objectDeserializer0.getObjectIdReader();
        boolean boolean3 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass4 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = objectDeserializer0.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode6);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer10 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer9);
        java.util.Collection<java.lang.Object> objCollection11 = jsonNodeJsonDeserializer10.getKnownPropertyNames();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer10);
        org.junit.Assert.assertNull(objCollection11);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayNodeJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayNodeJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayNodeJsonDeserializer2.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayNodeJsonDeserializer7.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayNodeJsonDeserializer7.getEmptyValue(deserializationContext10);
        java.util.Collection<java.lang.Object> objCollection12 = arrayNodeJsonDeserializer7.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayNodeJsonDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer15 = arrayNodeJsonDeserializer7.unwrappingDeserializer(nameTransformer14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode19 = arrayNodeJsonDeserializer15.deserialize(jsonParser16, deserializationContext17, arrayNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(objCollection12);
        org.junit.Assert.assertNull(arrayNode13);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer15);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass1 = arrayDeserializer0.handledType();
        boolean boolean2 = arrayDeserializer0.isCachable();
        boolean boolean3 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        boolean boolean7 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection9 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType12 = arrayDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection13 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean14 = arrayDeserializer0.isCachable();
        boolean boolean15 = arrayDeserializer0.isCachable();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        boolean boolean7 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.deserialize(jsonParser9, deserializationContext10, arrayNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(arrayNode8);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = arrayDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode8);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = jsonNodeDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType8 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.deserialize(jsonParser10, deserializationContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNotNull(jsonNode9);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType6 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = objectDeserializer0.deserializeWithType(jsonParser10, deserializationContext11, typeDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectIdReader5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(objectIdReader9);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        boolean boolean3 = arrayDeserializer0.isCachable();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue(deserializationContext9);
        boolean boolean11 = arrayDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass12 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer14 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer13);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer0.getEmptyValue(deserializationContext15);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer14);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass6 = objectDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.handledType();
        java.util.Collection<java.lang.Object> objCollection8 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = jsonNodeDeserializer0.getNullValue(deserializationContext14);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        boolean boolean6 = arrayDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass9 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getNullValue(deserializationContext10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty13 = arrayDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(arrayNode11);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType4 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection7 = arrayDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass8 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer0.unwrappingDeserializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = arrayDeserializer0.getValueClass();
        java.util.Collection<java.lang.Object> objCollection13 = arrayDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection14 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType15 = arrayDeserializer0.getValueType();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objCollection13);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(javaType15);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = jsonNodeJsonDeserializer9.getDelegatee();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeJsonDeserializer9.unwrappingDeserializer(nameTransformer11);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer8 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.deserialize(jsonParser9, deserializationContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer8);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        boolean boolean3 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JavaType javaType10 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue(deserializationContext11);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.handledType();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer11 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer10);
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType13 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer16 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = jsonNodeDeserializer16.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = jsonNodeDeserializer16.getNullValue(deserializationContext18);
        com.fasterxml.jackson.databind.JavaType javaType20 = jsonNodeDeserializer16.getValueType();
        boolean boolean21 = jsonNodeDeserializer16.isCachable();
        java.util.Collection<java.lang.Object> objCollection22 = jsonNodeDeserializer16.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType23 = jsonNodeDeserializer16.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = jsonNodeDeserializer16.getEmptyValue();
        java.lang.Class<?> wildcardClass25 = jsonNodeDeserializer16.getValueClass();
        java.lang.Class<?> wildcardClass26 = jsonNodeDeserializer16.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = jsonNodeDeserializer16.getEmptyValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer29 = jsonNodeDeserializer16.unwrappingDeserializer(nameTransformer28);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext30 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = jsonNodeDeserializer16.getEmptyValue(deserializationContext30);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode32 = jsonNodeDeserializer0.deserialize(jsonParser14, deserializationContext15, jsonNode31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(objCollection22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer29);
        org.junit.Assert.assertNotNull(jsonNode31);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass5 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader9 = jsonNodeDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = jsonNodeDeserializer0.deserializeWithType(jsonParser11, deserializationContext12, typeDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(objectIdReader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(arrayNode5);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader2 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        boolean boolean10 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNull(objectIdReader2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayNodeJsonDeserializer2.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayNodeJsonDeserializer2.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer7 = arrayNodeJsonDeserializer2.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayNodeJsonDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayNodeJsonDeserializer7.getEmptyValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = arrayNodeJsonDeserializer7.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = arrayNodeJsonDeserializer7.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode13 = arrayNodeJsonDeserializer7.getNullValue(deserializationContext12);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer7);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(wildcardJsonDeserializer10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNull(arrayNode13);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getEmptyValue();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.handledType();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = objectDeserializer0.getValueType();
        boolean boolean5 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.JavaType javaType3 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode5 = arrayDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode8 = arrayDeserializer0.getEmptyValue(deserializationContext7);
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass12 = arrayDeserializer11.handledType();
        boolean boolean13 = arrayDeserializer11.isCachable();
        boolean boolean14 = arrayDeserializer11.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType15 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode17 = arrayDeserializer11.getEmptyValue(deserializationContext16);
        java.util.Collection<java.lang.Object> objCollection18 = arrayDeserializer11.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType19 = arrayDeserializer11.getValueType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader20 = arrayDeserializer11.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = arrayDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(arrayNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(arrayNode8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(arrayDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(arrayNode17);
        org.junit.Assert.assertNull(objCollection18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNull(objectIdReader20);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass3 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer0.getNullValue(deserializationContext8);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = jsonNodeDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection5 = objectDeserializer0.getKnownPropertyNames();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        java.util.Collection<java.lang.Object> objCollection5 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer7 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer9 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer8);
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer7);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.lang.Class<?> wildcardClass3 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer5 = arrayDeserializer0.unwrappingDeserializer(nameTransformer4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue(deserializationContext6);
        com.fasterxml.jackson.databind.JavaType javaType8 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode10 = arrayDeserializer0.getEmptyValue(deserializationContext9);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(arrayNode10);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        boolean boolean3 = arrayDeserializer0.isCachable();
        boolean boolean4 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer0.getEmptyValue(deserializationContext11);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer0.getNullValue(deserializationContext13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer16 = arrayDeserializer0.unwrappingDeserializer(nameTransformer15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer18 = arrayNodeJsonDeserializer16.unwrappingDeserializer(nameTransformer17);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer16);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer18);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        boolean boolean3 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(arrayNode6);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectDeserializer0.getEmptyValue(deserializationContext3);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectDeserializer0.getNullValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectDeserializer0.getNullValue(deserializationContext7);
        java.util.Collection<java.lang.Object> objCollection9 = objectDeserializer0.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty11 = objectDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode4);
        org.junit.Assert.assertNull(objectNode6);
        org.junit.Assert.assertNull(objectNode8);
        org.junit.Assert.assertNull(objCollection9);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JavaType javaType1 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JavaType javaType6 = jsonNodeDeserializer0.getValueType();
        boolean boolean7 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNull(javaType1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer5 = objectDeserializer0.unwrappingDeserializer(nameTransformer4);
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader7 = objectDeserializer0.getObjectIdReader();
        boolean boolean8 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectDeserializer0.deserialize(jsonParser9, deserializationContext10, objectNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(objectIdReader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getEmptyValue(deserializationContext3);
        java.util.Collection<java.lang.Object> objCollection5 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode6 = arrayDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer0.getEmptyValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode11 = arrayDeserializer0.getEmptyValue(deserializationContext10);
        java.lang.Class<?> wildcardClass12 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNull(objCollection5);
        org.junit.Assert.assertNull(arrayNode6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNull(arrayNode11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        java.util.Collection<java.lang.Object> objCollection3 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue();
        boolean boolean5 = arrayDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = arrayDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer8 = arrayDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = arrayNodeJsonDeserializer8.getDelegatee();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(objCollection3);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty10 = jsonNodeDeserializer0.findBackReference("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not handle managed/back reference '': type: value deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection6 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType7 = jsonNodeDeserializer0.getValueType();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer11 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        java.lang.Class<?> wildcardClass12 = arrayDeserializer11.handledType();
        boolean boolean13 = arrayDeserializer11.isCachable();
        boolean boolean14 = arrayDeserializer11.isCachable();
        java.lang.Class<?> wildcardClass15 = arrayDeserializer11.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = arrayDeserializer11.getObjectIdReader();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode18 = arrayDeserializer11.getEmptyValue(deserializationContext17);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(arrayDeserializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNull(arrayNode18);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer.getInstance();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer2 = arrayDeserializer0.unwrappingDeserializer(nameTransformer1);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode3 = arrayDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection4 = arrayDeserializer0.getKnownPropertyNames();
        boolean boolean5 = arrayDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = arrayDeserializer0.getValueType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer11 = arrayDeserializer0.unwrappingDeserializer(nameTransformer10);
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer2);
        org.junit.Assert.assertNull(arrayNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(arrayNodeJsonDeserializer11);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass11 = jsonNodeDeserializer0.getValueClass();
        boolean boolean12 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = jsonNodeDeserializer0.deserializeWithType(jsonParser14, deserializationContext15, typeDeserializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        java.lang.Class<?> wildcardClass13 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JavaType javaType14 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader16 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer17 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode19 = arrayDeserializer17.getNullValue(deserializationContext18);
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode20 = arrayDeserializer17.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader21 = arrayDeserializer17.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode22 = arrayDeserializer17.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType23 = arrayDeserializer17.getValueType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer24 = jsonNodeDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(wildcardJsonDeserializer15);
        org.junit.Assert.assertNull(objectIdReader16);
        org.junit.Assert.assertNotNull(arrayDeserializer17);
        org.junit.Assert.assertNull(arrayNode19);
        org.junit.Assert.assertNull(arrayNode20);
        org.junit.Assert.assertNull(objectIdReader21);
        org.junit.Assert.assertNull(arrayNode22);
        org.junit.Assert.assertNull(javaType23);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass2 = arrayDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = arrayDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass4 = arrayDeserializer0.handledType();
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.getClass();
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer0 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode2 = arrayDeserializer0.getNullValue(deserializationContext1);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode4 = arrayDeserializer0.getNullValue(deserializationContext3);
        java.lang.Class<?> wildcardClass5 = arrayDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader6 = arrayDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(arrayDeserializer0);
        org.junit.Assert.assertNull(arrayNode2);
        org.junit.Assert.assertNull(arrayNode4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(objectIdReader6);
        org.junit.Assert.assertNull(arrayNode7);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectDeserializer0.getNullValue(deserializationContext2);
        java.util.Collection<java.lang.Object> objCollection4 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue();
        java.util.Collection<java.lang.Object> objCollection6 = objectDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ObjectNode> objectNodeJsonDeserializer8 = objectDeserializer0.unwrappingDeserializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader10 = objectDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objectNode3);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objCollection6);
        org.junit.Assert.assertNotNull(objectNodeJsonDeserializer8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(objectIdReader10);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        boolean boolean8 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass9 = jsonNodeDeserializer0.getValueClass();
        java.lang.Class<?> wildcardClass10 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer12 = jsonNodeDeserializer0.unwrappingDeserializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.JsonNode> jsonNodeJsonDeserializer14 = jsonNodeJsonDeserializer12.unwrappingDeserializer(nameTransformer13);
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer12);
        org.junit.Assert.assertNotNull(jsonNodeJsonDeserializer14);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = objectDeserializer0.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer8 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType9 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(objectNode7);
        org.junit.Assert.assertNull(wildcardJsonDeserializer8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        boolean boolean5 = jsonNodeDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass6 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = jsonNodeDeserializer0.getDelegatee();
        java.lang.Class<?> wildcardClass8 = jsonNodeDeserializer0.getValueClass();
        boolean boolean9 = jsonNodeDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader11 = jsonNodeDeserializer0.getObjectIdReader();
        java.lang.Class<?> wildcardClass12 = jsonNodeDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader13 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = jsonNodeDeserializer0.getEmptyValue();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNull(objectIdReader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(objectIdReader13);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        boolean boolean1 = objectDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection2 = objectDeserializer0.getKnownPropertyNames();
        java.lang.Class<?> wildcardClass3 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer4 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer arrayDeserializer5 = com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ArrayDeserializer._instance;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode7 = arrayDeserializer5.getNullValue(deserializationContext6);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode9 = arrayDeserializer5.getEmptyValue(deserializationContext8);
        java.lang.Class<?> wildcardClass10 = arrayDeserializer5.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode12 = arrayDeserializer5.getNullValue(deserializationContext11);
        com.fasterxml.jackson.databind.JavaType javaType13 = arrayDeserializer5.getValueType();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode14 = arrayDeserializer5.getNullValue();
        com.fasterxml.jackson.databind.node.ArrayNode arrayNode15 = arrayDeserializer5.getEmptyValue();
        java.util.Collection<java.lang.Object> objCollection16 = arrayDeserializer5.getKnownPropertyNames();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = objectDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode>) arrayDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(wildcardJsonDeserializer4);
        org.junit.Assert.assertNotNull(arrayDeserializer5);
        org.junit.Assert.assertNull(arrayNode7);
        org.junit.Assert.assertNull(arrayNode9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(arrayNode12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(arrayNode14);
        org.junit.Assert.assertNull(arrayNode15);
        org.junit.Assert.assertNull(objCollection16);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = jsonNodeDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = jsonNodeDeserializer0.getNullValue(deserializationContext6);
        java.util.Collection<java.lang.Object> objCollection8 = jsonNodeDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = jsonNodeDeserializer0.getNullValue(deserializationContext9);
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = jsonNodeDeserializer0.getNullValue();
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNotNull(jsonNode5);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNull(objCollection8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode12);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = objectDeserializer0.getObjectIdReader();
        boolean boolean2 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.JavaType javaType3 = objectDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer6 = objectDeserializer0.getDelegatee();
        boolean boolean7 = objectDeserializer0.isCachable();
        boolean boolean8 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectDeserializer0.getNullValue(deserializationContext9);
        org.junit.Assert.assertNull(objectIdReader1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertNull(wildcardJsonDeserializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(objectNode10);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode1 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = jsonNodeDeserializer0.getNullValue(deserializationContext2);
        com.fasterxml.jackson.databind.JavaType javaType4 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = jsonNodeDeserializer0.getNullValue(deserializationContext5);
        java.lang.Class<?> wildcardClass7 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = jsonNodeDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JavaType javaType9 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JavaType javaType10 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonDeserializer<com.fasterxml.jackson.databind.node.ArrayNode> arrayNodeJsonDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = jsonNodeDeserializer0.replaceDelegatee(arrayNodeJsonDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonNode1);
        org.junit.Assert.assertNotNull(jsonNode3);
        org.junit.Assert.assertNull(javaType4);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(wildcardJsonDeserializer11);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer objectDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer.ObjectDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = objectDeserializer0.getNullValue(deserializationContext1);
        boolean boolean3 = objectDeserializer0.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectDeserializer0.getNullValue(deserializationContext4);
        boolean boolean6 = objectDeserializer0.isCachable();
        java.lang.Class<?> wildcardClass7 = objectDeserializer0.getValueClass();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader8 = objectDeserializer0.getObjectIdReader();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = objectDeserializer0.getDelegatee();
        com.fasterxml.jackson.databind.JavaType javaType10 = objectDeserializer0.getValueType();
        org.junit.Assert.assertNull(objectNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(objectNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(objectIdReader8);
        org.junit.Assert.assertNull(wildcardJsonDeserializer9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer0 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        java.lang.Class<?> wildcardClass1 = jsonNodeDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonNode jsonNode2 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JavaType javaType3 = jsonNodeDeserializer0.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = jsonNodeDeserializer0.getNullValue();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = jsonNodeDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer jsonNodeDeserializer8 = new com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = jsonNodeDeserializer8.getNullValue();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = jsonNodeDeserializer8.getNullValue(deserializationContext10);
        com.fasterxml.jackson.databind.JavaType javaType12 = jsonNodeDeserializer8.getValueType();
        boolean boolean13 = jsonNodeDeserializer8.isCachable();
        java.util.Collection<java.lang.Object> objCollection14 = jsonNodeDeserializer8.getKnownPropertyNames();
        com.fasterxml.jackson.databind.JavaType javaType15 = jsonNodeDeserializer8.getValueType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = jsonNodeDeserializer8.getEmptyValue();
        java.lang.Class<?> wildcardClass17 = jsonNodeDeserializer8.getValueClass();
        java.lang.Class<?> wildcardClass18 = jsonNodeDeserializer8.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = jsonNodeDeserializer8.getDelegatee();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = jsonNodeDeserializer8.getNullValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode21 = jsonNodeDeserializer0.deserialize(jsonParser6, deserializationContext7, jsonNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not update object of type com.fasterxml.jackson.databind.node.NullNode (by deserializer of type com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer)");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(jsonNode2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(jsonNode4);
        org.junit.Assert.assertNull(wildcardJsonDeserializer5);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objCollection14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(wildcardJsonDeserializer19);
        org.junit.Assert.assertNotNull(jsonNode20);
    }
}

