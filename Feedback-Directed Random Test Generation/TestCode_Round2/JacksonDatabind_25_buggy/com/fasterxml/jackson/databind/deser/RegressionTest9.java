package com.fasterxml.jackson.databind.deser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._findCachedDeserializer(javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(javaTypeMap14);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer16 = deserializerCache0._createDeserializer2(deserializationContext12, deserializerFactory13, javaType14, beanDescription15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._handleUnknownValueDeserializer(javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Class<?> wildcardClass7 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig1, javaType2);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig4, javaType5);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig7, javaType8);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig10, javaType11);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig13, javaType14);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig16, javaType17);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig19, javaType20);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig22, javaType23);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig25, javaType26);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig28, javaType29);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig31, javaType32);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig34 = null;
        com.fasterxml.jackson.databind.JavaType javaType35 = null;
        com.fasterxml.jackson.databind.JavaType javaType36 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig34, javaType35);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        com.fasterxml.jackson.databind.JavaType javaType39 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig37, javaType38);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        com.fasterxml.jackson.databind.JavaType javaType42 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig40, javaType41);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig43 = null;
        com.fasterxml.jackson.databind.JavaType javaType44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig43, javaType44);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig46 = null;
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig46, javaType47);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig49 = null;
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        com.fasterxml.jackson.databind.JavaType javaType51 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig49, javaType50);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig52 = null;
        com.fasterxml.jackson.databind.JavaType javaType53 = null;
        com.fasterxml.jackson.databind.JavaType javaType54 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig52, javaType53);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig55 = null;
        com.fasterxml.jackson.databind.JavaType javaType56 = null;
        com.fasterxml.jackson.databind.JavaType javaType57 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig55, javaType56);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig58 = null;
        com.fasterxml.jackson.databind.JavaType javaType59 = null;
        com.fasterxml.jackson.databind.JavaType javaType60 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig58, javaType59);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig61 = null;
        com.fasterxml.jackson.databind.JavaType javaType62 = null;
        com.fasterxml.jackson.databind.JavaType javaType63 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig61, javaType62);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig64 = null;
        com.fasterxml.jackson.databind.JavaType javaType65 = null;
        com.fasterxml.jackson.databind.JavaType javaType66 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig64, javaType65);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig67 = null;
        com.fasterxml.jackson.databind.JavaType javaType68 = null;
        com.fasterxml.jackson.databind.JavaType javaType69 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig67, javaType68);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig70 = null;
        com.fasterxml.jackson.databind.JavaType javaType71 = null;
        com.fasterxml.jackson.databind.JavaType javaType72 = simpleAbstractTypeResolver0.resolveAbstractType(deserializationConfig70, javaType71);
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig73 = null;
        com.fasterxml.jackson.databind.JavaType javaType74 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JavaType javaType75 = simpleAbstractTypeResolver0.findTypeMapping(deserializationConfig73, javaType74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertNull(javaType30);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(javaType39);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(javaType45);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertNull(javaType51);
        org.junit.Assert.assertNull(javaType54);
        org.junit.Assert.assertNull(javaType57);
        org.junit.Assert.assertNull(javaType60);
        org.junit.Assert.assertNull(javaType63);
        org.junit.Assert.assertNull(javaType66);
        org.junit.Assert.assertNull(javaType69);
        org.junit.Assert.assertNull(javaType72);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter11 = deserializerCache0.findConverter(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._findCachedDeserializer(javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        int int14 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj15 = deserializerCache0.writeReplace();
        java.lang.Object obj16 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap17 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer21 = deserializerCache0._createAndCache2(deserializationContext18, deserializerFactory19, javaType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(javaTypeMap17);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        int int14 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj15 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap17 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext18 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer22 = deserializerCache0._createDeserializer2(deserializationContext18, deserializerFactory19, javaType20, beanDescription21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(javaTypeMap17);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0._handleUnknownKeyDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter9 = deserializerCache0.findConverter(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findConvertingDeserializer(deserializationContext9, annotated10, objJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0.findKeyDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._findCachedDeserializer(javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        int int10 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass5 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findConvertingDeserializer(deserializationContext9, annotated10, objJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer14 = deserializerCache0._handleUnknownKeyDeserializer(javaType13);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass14 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._handleUnknownValueDeserializer(javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Class<?> wildcardClass7 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter7 = deserializerCache0.findConverter(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._cachedDeserializers;
        int int14 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = deserializerCache0.hasValueDeserializerFor(deserializationContext15, deserializerFactory16, javaType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findValueDeserializer(deserializationContext7, deserializerFactory8, javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Class<?> wildcardClass7 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0._handleUnknownKeyDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap14 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertNotNull(javaTypeMap14);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0._handleUnknownKeyDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0._findCachedDeserializer(javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer9 = deserializerCache0._handleUnknownKeyDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext11, annotated12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._findCachedDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        int int10 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = deserializerCache0._createAndCache2(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._findCachedDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass11 = javaTypeMap10.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._handleUnknownValueDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._findCachedDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._handleUnknownValueDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer7 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._findCachedDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter15 = deserializerCache0.findConverter(deserializationContext13, annotated14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer6 = deserializerCache0._handleUnknownKeyDeserializer(javaType5);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._findCachedDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._findCachedDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._createDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._findCachedDeserializer(javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        int int12 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext14, annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._findCachedDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
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
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findValueDeserializer(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._createAndCache2(deserializationContext5, deserializerFactory6, javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = deserializerCache0.hasValueDeserializerFor(deserializationContext3, deserializerFactory4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer14 = deserializerCache0._handleUnknownKeyDeserializer(javaType13);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer10 = deserializerCache0._createDeserializer2(deserializationContext6, deserializerFactory7, javaType8, beanDescription9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0.findConvertingDeserializer(deserializationContext11, annotated12, objJsonDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0._handleUnknownKeyDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._createDeserializer(deserializationContext6, deserializerFactory7, javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = deserializerCache0.findConvertingDeserializer(deserializationContext14, annotated15, objJsonDeserializer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._findCachedDeserializer(javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._handleUnknownValueDeserializer(javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0.findConvertingDeserializer(deserializationContext9, annotated10, objJsonDeserializer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = deserializerCache0._createDeserializer2(deserializationContext5, deserializerFactory6, javaType7, beanDescription8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext14, annotated15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap4);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._handleUnknownValueDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter17 = deserializerCache0.findConverter(deserializationContext15, annotated16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer16 = deserializerCache0.findKeyDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated16 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = deserializerCache0.findConvertingDeserializer(deserializationContext15, annotated16, objJsonDeserializer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        int int1 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._handleUnknownValueDeserializer(javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._createDeserializer(deserializationContext12, deserializerFactory13, javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createAndCache2(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer15 = deserializerCache0._handleUnknownValueDeserializer(javaType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass11 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Class<?> wildcardClass8 = javaTypeMap7.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter7 = deserializerCache0.findConverter(deserializationContext5, annotated6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(javaTypeMap13);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0._findCachedDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj11 = deserializerCache0.writeReplace();
        int int12 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._handleUnknownValueDeserializer(javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._handleUnknownValueDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated12 = null;
        com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0.findConvertingDeserializer(deserializationContext11, annotated12, objJsonDeserializer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass10 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._handleUnknownValueDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._findCachedDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer16 = deserializerCache0.findKeyDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj12 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0._createDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        int int9 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Class<?> wildcardClass10 = deserializerCache0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext13 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer16 = deserializerCache0._createDeserializer(deserializationContext13, deserializerFactory14, javaType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer8 = deserializerCache0._handleUnknownKeyDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter10 = deserializerCache0.findConverter(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap13 = deserializerCache0._incompleteDeserializers;
        int int14 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap15 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(javaTypeMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap15);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext14 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer17 = deserializerCache0.findValueDeserializer(deserializationContext14, deserializerFactory15, javaType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap12);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer11 = deserializerCache0._createDeserializer2(deserializationContext7, deserializerFactory8, javaType9, beanDescription10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0.findValueDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        int int14 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj15 = deserializerCache0.writeReplace();
        java.lang.Object obj16 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer18 = deserializerCache0._handleUnknownValueDeserializer(javaType17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter11 = deserializerCache0.findConverter(deserializationContext9, annotated10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext6, annotated7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0._handleUnknownValueDeserializer(javaType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int10 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._findCachedDeserializer(javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer9 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer13 = deserializerCache0._findCachedDeserializer(javaType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        int int5 = deserializerCache0.cachedDeserializersCount();
        int int6 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap7);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory6 = null;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        com.fasterxml.jackson.databind.BeanDescription beanDescription8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = deserializerCache0._createDeserializer2(deserializationContext5, deserializerFactory6, javaType7, beanDescription8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(javaTypeMap10);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        int int8 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext11 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer14 = deserializerCache0._createAndCacheValueDeserializer(deserializationContext11, deserializerFactory12, javaType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null JavaType passed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext9 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer12 = deserializerCache0._createAndCache2(deserializationContext9, deserializerFactory10, javaType11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaTypeMap1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        int int11 = deserializerCache0.cachedDeserializersCount();
        int int12 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj13 = deserializerCache0.writeReplace();
        int int14 = deserializerCache0.cachedDeserializersCount();
        int int15 = deserializerCache0.cachedDeserializersCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.lang.Object obj5 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        int int7 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.lang.Object obj9 = deserializerCache0.writeReplace();
        java.lang.Object obj10 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap11 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap12 = deserializerCache0._incompleteDeserializers;
        java.lang.Class<?> wildcardClass13 = javaTypeMap12.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(javaTypeMap11);
        org.junit.Assert.assertNotNull(javaTypeMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer8 = deserializerCache0._handleUnknownValueDeserializer(javaType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap6);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj4 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        int int8 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer10 = deserializerCache0._handleUnknownKeyDeserializer(javaType9);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.JsonMappingException; message: Can not find a (Map) Key deserializer for type null");
        } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        int int7 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.deser.DeserializerFactory deserializerFactory9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.KeyDeserializer keyDeserializer11 = deserializerCache0.findKeyDeserializer(deserializationContext8, deserializerFactory9, javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int4 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter9 = deserializerCache0.findConverter(deserializationContext7, annotated8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._cachedDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj8 = deserializerCache0.writeReplace();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        int int6 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj7 = deserializerCache0.writeReplace();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer10 = deserializerCache0.findDeserializerFromAnnotation(deserializationContext8, annotated9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.lang.Object obj2 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap6 = deserializerCache0._cachedDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap7 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int9 = deserializerCache0.cachedDeserializersCount();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap10 = deserializerCache0._cachedDeserializers;
        int int11 = deserializerCache0.cachedDeserializersCount();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext12 = null;
        com.fasterxml.jackson.databind.introspect.Annotated annotated13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.Converter<java.lang.Object, java.lang.Object> objConverter14 = deserializerCache0.findConverter(deserializationContext12, annotated13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(javaTypeMap6);
        org.junit.Assert.assertNotNull(javaTypeMap7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap1 = deserializerCache0._cachedDeserializers;
        int int2 = deserializerCache0.cachedDeserializersCount();
        java.lang.Object obj3 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
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
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(javaTypeMap5);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._cachedDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap3 = deserializerCache0._cachedDeserializers;
        int int4 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._incompleteDeserializers;
        deserializerCache0.flushCachedDeserializers();
        int int7 = deserializerCache0.cachedDeserializersCount();
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertNotNull(javaTypeMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        com.fasterxml.jackson.databind.deser.DeserializerCache deserializerCache0 = new com.fasterxml.jackson.databind.deser.DeserializerCache();
        java.lang.Object obj1 = deserializerCache0.writeReplace();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap2 = deserializerCache0._incompleteDeserializers;
        int int3 = deserializerCache0.cachedDeserializersCount();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap4 = deserializerCache0._incompleteDeserializers;
        java.util.concurrent.ConcurrentHashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap5 = deserializerCache0._cachedDeserializers;
        java.lang.Object obj6 = deserializerCache0.writeReplace();
        deserializerCache0.flushCachedDeserializers();
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap8 = deserializerCache0._incompleteDeserializers;
        java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> javaTypeMap9 = deserializerCache0._incompleteDeserializers;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> objJsonDeserializer11 = deserializerCache0._handleUnknownValueDeserializer(javaType10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(javaTypeMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(javaTypeMap4);
        org.junit.Assert.assertNotNull(javaTypeMap5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(javaTypeMap8);
        org.junit.Assert.assertNotNull(javaTypeMap9);
    }
}

