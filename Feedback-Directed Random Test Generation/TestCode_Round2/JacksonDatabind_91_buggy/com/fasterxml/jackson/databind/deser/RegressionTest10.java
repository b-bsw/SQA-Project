package com.fasterxml.jackson.databind.deser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext15, deserializerFactory16, javaType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj14 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap15 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(javaTypeMap15);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = deserializerCache0.hasValueDeserializerFor(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCache2(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter14 = deserializerCache0.findConverter(deserializationContext12, annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj15 = deserializerCache0.writeReplace();
        int int16 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap17 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter20 = deserializerCache0.findConverter(deserializationContext18, annotated19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertNotNull(javaTypeMap14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap17);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass4 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer14 = deserializerCache0.findKeyDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter11 = deserializerCache0.findConverter(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass13 = javaTypeMap12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0.findValueDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = deserializerCache0.hasValueDeserializerFor(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._findCachedDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        int int4 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Class<?> wildcardClass9 = deserializerCache0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = deserializerCache0.hasValueDeserializerFor(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass11 = deserializerCache0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int16 = deserializerCache0.cachedDeserializersCount();
        int int17 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap18 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap18);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0.findKeyDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._findCachedDeserializer(javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._incompleteDeserializers;
        int int15 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap16 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap17 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap18 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = deserializerCache0.hasValueDeserializerFor(deserializationContext19, deserializerFactory20, javaType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertNotNull(javaTypeMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap16);
        org.junit.Assert.assertNotNull(javaTypeMap17);
        org.junit.Assert.assertNotNull(javaTypeMap18);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findConvertingDeserializer(deserializationContext5, annotated6, objJsonDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = deserializerCache0.hasValueDeserializerFor(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        int int13 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findConvertingDeserializer(deserializationContext6, annotated7, objJsonDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findConvertingDeserializer(deserializationContext10, annotated11, objJsonDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer6 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        int int13 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = deserializerCache0._createDeserializer(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0.findKeyDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer14 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findConvertingDeserializer(deserializationContext10, annotated11, objJsonDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass11 = javaTypeMap10.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = deserializerCache0.hasValueDeserializerFor(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._findCachedDeserializer(javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0.findKeyDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass13 = deserializerCache0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._findCachedDeserializer(javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = deserializerCache0._createDeserializer2(deserializationContext13, deserializerFactory14, javaType15, beanDescription16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0.findKeyDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer14 = deserializerCache0._createDeserializer2(deserializationContext10, deserializerFactory11, javaType12, beanDescription13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findConvertingDeserializer(deserializationContext8, annotated9, objJsonDeserializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        int int12 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer14 = deserializerCache0.findKeyDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = deserializerCache0.hasValueDeserializerFor(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Class<?> wildcardClass14 = deserializerCache0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0.findKeyDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass9 = deserializerCache0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = deserializerCache0._createDeserializer2(deserializationContext13, deserializerFactory14, javaType15, beanDescription16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCache2(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass12 = javaTypeMap11.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass5 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer17 = deserializerCache0._createDeserializer2(deserializationContext13, deserializerFactory14, javaType15, beanDescription16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass5 = deserializerCache0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass10 = deserializerCache0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Class<?> wildcardClass10 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findConvertingDeserializer(deserializationContext12, annotated13, objJsonDeserializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCache2(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj15 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap16 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap17 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj18 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertNotNull(javaTypeMap14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(javaTypeMap16);
        org.junit.Assert.assertNotNull(javaTypeMap17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Class<?> wildcardClass10 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = deserializerCache0.hasValueDeserializerFor(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        int int13 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap15 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap16 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext17 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer21 = deserializerCache0._createDeserializer2(deserializationContext17, deserializerFactory18, javaType19, beanDescription20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap14);
        org.junit.Assert.assertNotNull(javaTypeMap15);
        org.junit.Assert.assertNotNull(javaTypeMap16);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._cachedDeserializers;
        int int14 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = deserializerCache0.hasValueDeserializerFor(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._incompleteDeserializers;
        int int15 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap16 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj17 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertNotNull(javaTypeMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCache2(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        int int14 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int16 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer17 = deserializerCache0.findKeyDeserializer(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext15, annotated16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter9 = deserializerCache0.findConverter(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0.findValueDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findConvertingDeserializer(deserializationContext10, annotated11, objJsonDeserializer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer7 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = deserializerCache0.hasValueDeserializerFor(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer5 = deserializerCache0._findCachedDeserializer(javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int13 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj15 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext16 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter18 = deserializerCache0.findConverter(deserializationContext16, annotated17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._findCachedDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findConvertingDeserializer(deserializationContext6, annotated7, objJsonDeserializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findConvertingDeserializer(deserializationContext5, annotated6, objJsonDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter13 = deserializerCache0.findConverter(deserializationContext11, annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createAndCache2(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createDeserializer(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        int int10 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        int int13 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer15 = deserializerCache0.findKeyDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._findCachedDeserializer(javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = deserializerCache0.hasValueDeserializerFor(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer13 = deserializerCache0._createDeserializer2(deserializationContext9, deserializerFactory10, javaType11, beanDescription12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._cachedDeserializers;
        int int14 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj16 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        int int14 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap14);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter10 = deserializerCache0.findConverter(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._incompleteDeserializers;
        int int15 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap16 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap17 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap18 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext19 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer22 = deserializerCache0._createDeserializer(deserializationContext19, deserializerFactory20, javaType21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertNotNull(javaTypeMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap16);
        org.junit.Assert.assertNotNull(javaTypeMap17);
        org.junit.Assert.assertNotNull(javaTypeMap18);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = deserializerCache0.hasValueDeserializerFor(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._findCachedDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._findCachedDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer12 = deserializerCache0._createDeserializer2(deserializationContext8, deserializerFactory9, javaType10, beanDescription11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass5 = javaTypeMap4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createAndCache2(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0.findKeyDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer6 = deserializerCache0._createAndCache2(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter11 = deserializerCache0.findConverter(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._createAndCache2(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        int int12 = deserializerCache0.cachedDeserializersCount();
        int int13 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter16 = deserializerCache0.findConverter(deserializationContext14, annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = deserializerCache0.hasValueDeserializerFor(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = deserializerCache0.hasValueDeserializerFor(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer17 = deserializerCache0.findKeyDeserializer(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext10, annotated11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass8 = javaTypeMap7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        int int13 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext14, annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._handleUnknownValueDeserializer(deserializationContext13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter13 = deserializerCache0.findConverter(deserializationContext11, annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0._createAndCache2(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findValueDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer12 = deserializerCache0.findKeyDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0._handleUnknownKeyDeserializer(deserializationContext9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass11 = javaTypeMap10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findConvertingDeserializer(deserializationContext7, annotated8, objJsonDeserializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext10 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer13 = deserializerCache0.findKeyDeserializer(deserializationContext10, deserializerFactory11, javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._findCachedDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._findCachedDeserializer(javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer15 = deserializerCache0._createDeserializer2(deserializationContext11, deserializerFactory12, javaType13, beanDescription14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer19 = deserializerCache0._createDeserializer2(deserializationContext15, deserializerFactory16, javaType17, beanDescription18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertNotNull(javaTypeMap14);
    }
}

